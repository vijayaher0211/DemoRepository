package Default;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class XMLGenerator2 {

	public static String path1File = "IndiabullsHomePageURLs.java";
	public static boolean downTimeStatus = true;
	public static String clientName = "Indiabulls";
	public static String applicationName = "Indiabulls Home Page URLs";

	public static void setDownTime()
	{
		days = new LinkedHashMap<String, String>();
		days.put("Sunday","7:59to21:0");
		days.put("Monday","7:59to21:0");
		days.put("Tuesday","7:59to21:0");
		days.put("Wednesday","7:59to21:0");
		days.put("Thursday","7:59to21:0");
		days.put("Friday","7:59to21:0");
		days.put("Saturday","7:59to21:0");
		
		Iterator itr = days.entrySet().iterator();
		for(Map.Entry pair:days.entrySet())
		{
			key = (String) pair.getKey();
				value = (String) pair.getValue();
				extractTime(key, value);
				
				pair = (Map.Entry)itr.next();
		}
	}	
	
	public static String path1 = "D:\\VijayAher\\selenium_1.8\\src\\com\\qklab\\monitoring\\";
	public static String path = path1 + path1File;
	public static String lines = "";
	public static ArrayList<String> pages = new ArrayList<String>();
	public static String downtime = "";
	public static LinkedHashMap<String, String> days;
	
	public static String key, value;
	
	public static String staticPart1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n"
			+"<Script>\n	<Application active=\"true\" alertPopup=\"false\" bandwidth=\"512Kbps\"\n 		clearcache=\"true\" client=\""+clientName+"\" component=\"false\" errorPopup=\"true\"\n		frequency=\"15\" isp=\"\" location=\"Mumbai-QK\" name=\""+applicationName+"\"\n		raiseticket=\"false\" threshold=\"90\" timeout=\"90\" truelog=\"false\" video=\"false\">\n"
			+"		<Pages>";
	
	public static String staticPart2 = "\t\t</Pages>\n		<Schedule>\n			<Applicationlevel>\n				<OneTime />\n			<RegularDowntime />\n			</Applicationlevel>\n			<Pagelevel>\n			<OneTime />\n				<RegularDowntime />\n			</Pagelevel>\n		</Schedule>\n"+
			"		<EscalationRules>\n			<Failure>\n				<EventRule fail_events=\"2\" no_of_machines=\"1\"\n					total_events=\"2\" />\n			</Failure>\n			<Performance>\n				<EventRule fail_events=\"2\" no_of_machines=\"1\" total_events=\"2\" />\n			</Performance>\n		</EscalationRules>\n"+
			"		<Logpath>D:\\Logs</Logpath>\n		<Machines>\n			<Machine browser=\"Chrome\" hostname=\"QKSRV071\" ip=\"10.0.19.146\">\n				<parameters>\n					<parameter enc=\"0\" name=\"CorpId\" value=\"QUALITY1\" />\n					<parameter enc=\"0\" name=\"LoginId\" value=\"QUALITY\" />\n					<parameter enc=\"0\" name=\"passwd\" value=\"quark_1237\" />\n"+
			"		\t\t\t<parameter enc=\"0\" name=\"transpassword\" value=\"quark@123\" />\n				</parameters>\n			</Machine>\n		</Machines>\n	</Application>\n</Script>";
	
	public static String staticPart2WithDownTimePart1 = "\t\t</Pages>\n		<Schedule>\n			<Applicationlevel>\n				<OneTime />\n			<RegularDowntime>";
	
	public static String staticPart2WithDownfTimePart2 = "\t\t\t</RegularDowntime>\n			</Applicationlevel>\n			<Pagelevel>\n			\t<OneTime />\n				<RegularDowntime/>\n			</Pagelevel>\n		</Schedule>\n"+
			"		<EscalationRules>\n			<Failure>\n				<EventRule fail_events=\"2\" no_of_machines=\"1\"\n					total_events=\"2\" />\n			</Failure>\n			<Performance>\n				<EventRule fail_events=\"2\" no_of_machines=\"1\" total_events=\"2\" />\n			</Performance>\n		</EscalationRules>\n"+
			"		<Logpath>D:\\Logs</Logpath>\n		<Machines>\n			<Machine browser=\"Chrome\" hostname=\"QKSRV071\" ip=\"10.0.19.146\">\n				<parameters>\n					<parameter enc=\"0\" name=\"CorpId\" value=\"QUALITY1\" />\n					<parameter enc=\"0\" name=\"LoginId\" value=\"QUALITY\" />\n					<parameter enc=\"0\" name=\"passwd\" value=\"quark_1237\" />\n"+
			"		\t\t\t<parameter enc=\"0\" name=\"transpassword\" value=\"quark@123\" />\n				</parameters>\n			</Machine>\n		</Machines>\n	</Application>\n</Script>";
	
	
	public static int weekDay(String day)
	{
		int week = 0;
		
		if(day.equals("Sunday")){week = 0;}
		if(day.equals("Monday")){week = 1;}
		if(day.equals("Tuesday")){week = 2;}
		if(day.equals("Wednesday")){week = 3;}
		if(day.equals("Thursday")){week = 4;}
		if(day.equals("Friday")){week = 5;}
		if(day.equals("Saturday")){week = 6;}
		
		return week;
	}
	
	public static void extractTime(String key, String value)
	{
		String dayForDownTie = "0", fromTime = "0",fromTimeHour = "0",fromTimeMin = "0", toTime = "0", toTimeHour = "0", toTimeMin = "0", arr[];
		
		int fromHour = 0, fromMin = 0, toHour = 0, toMin = 0;
		
		dayForDownTie = "" + weekDay(key);
		
		
		arr = value.split("to");
		
		fromTime = arr[0];
		toTime = arr[1];
		
		try
		{
			arr = fromTime.split(":");
		}
		catch(Exception e){}
		
		fromTimeHour = arr[0];
		fromTimeMin = arr[1];
		
		try
		{
			arr = toTime.split(":");
		}
		catch(Exception e){}
		toTimeHour = arr[0];
		toTimeMin = arr[1];
		
		fromHour = Integer.parseInt(fromTimeHour);
		fromMin = Integer.parseInt(fromTimeMin);
		toHour = Integer.parseInt(toTimeHour);
		toMin = Integer.parseInt(toTimeMin);
		
		if((fromHour == 0) && (fromMin == 0) && (toHour == 23) && (toMin == 59))
		{
			System.out.println("\t\t\t\t<Downtime active=\"true\" alert=\"false\" day=\"" + dayForDownTie + "\" end_hours=\"23\" end_minutes=\"59\" run=\"false\" start_hours=\"0\" start_minutes=\"0\" />");
		}
		else if((fromHour != 0) && (toHour == 23) && (toMin == 59))
		{
			System.out.println("\t\t\t\t<Downtime active=\"true\" alert=\"false\" day=\"" + dayForDownTie + "\" end_hours=\"" + fromHour + "\" end_minutes=\"" + fromMin + "\" run=\"false\" start_hours=\"0\" start_minutes=\"0\" />");
		}
		else
		{
			System.out.println("\t\t\t\t<Downtime active=\"true\" alert=\"false\" day=\"" + dayForDownTie + "\" end_hours=\"" + fromHour + "\" end_minutes=\"" + fromMin + "\" run=\"false\" start_hours=\"0\" start_minutes=\"0\" />");
			System.out.println("\t\t\t\t<Downtime active=\"true\" alert=\"false\" day=\"" + dayForDownTie + "\" end_hours=\"23\" end_minutes=\"59\" run=\"false\" start_hours=\"" + toHour + "\" start_minutes=\"" + toMin + "\" />");
		}
	}
	
	public static void extractPage(String line)
	{
		String page = "", temp = "";
		int len = 0, i = 0;
		temp = line.substring(line.indexOf("test")+6, line.indexOf("("));
		
		char ch = temp.charAt(i);
		len = temp.length();
		
		while(i < len)
		{
			ch = temp.charAt(i);
			if(i==0)
			{
				page += ch;
			}
			else
			{
				if(ch=='_')
				{
					page += " ";
				}
				else
				if((ch < 96) && (ch > 60))
				{
					page += " " + ch;
				}
				/*else if(ch=='_')
				{

					page += "++";
					page += " ";
				}*/
				else
				{
					page += "" + ch;
				}
			}
			i++;
		}
		
		pages.add(page);
	}
	
	public static void run()
	{
		String fileName = path;
        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
                if(line.contains("public void test"))
                {
                	lines += line + "\n";
                	extractPage(line);
                }
            }   
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) { System.out.println("no file found"); }
        catch(IOException ex) { System.out.println("no file found !"); }
	}
	
	public static void genxml()
	{
		
		if(!downTimeStatus)
		{
			System.out.println(staticPart1);
			
			int elements = pages.size();
			int no= 1, depno = 0; 
			
			for(String ele : pages)
			{
				System.out.println("\t\t\t<Page dependencyid=\""+ depno + "\" mandatory=\"false\" name=\"" + ele + "\" pageid=\"" + no + "\" threshold=\"90\" timeout=\"90\" />");
				
				depno++;
				no++;
			}
			System.out.println(staticPart2);
			
		}
		else
		{
			System.out.println(staticPart1);
			int elements = pages.size();
			int no= 1, depno = 0; 
			for(String ele : pages)
			{
				System.out.println("\t\t\t<Page dependencyid=\""+ depno + "\" mandatory=\"false\" name=\"" + ele + "\" pageid=\"" + no + "\" threshold=\"90\" timeout=\"90\" />");
				
				depno++;
				no++;
			}
			
			System.out.println(staticPart2WithDownTimePart1);
			setDownTime();
			System.out.println(staticPart2WithDownfTimePart2);
		}
	}
	
	public static void main(String[] args) {
		
		File javaFile = new File(path);
		run();
		genxml();
		
		
	}
	
}