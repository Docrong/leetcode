package com.ggr.leecode.temp;

import com.ggr.leecode.util.StaticMethod;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author : gr
 * @date : 2019/12/16 10:25
 */
public class EomsTest {
	public static void main(String[] args) throws Exception {
		List userList1 = new ArrayList();
		List userList2 = new ArrayList();
		List userList3 = new ArrayList();
		List userList4 = new ArrayList();
		List userList1country = new ArrayList();
		List userList2country = new ArrayList();
		List userList3country = new ArrayList();
		List userList4country = new ArrayList();

		List<Map> userList1city = new ArrayList();
		Map m1 = new HashMap<>();
		m1.put("mobile", "13907984040");
		m1.put("username", "王建平");
		m1.put("userid", "8a998abc94888ba118105210dc5cb941");
		m1.put("areaid", "景德镇");
		m1.put("deptid", "网络部");
		m1.put("profession", "118010115");
		m1.put("postid", "8a34a22c6ea08002016ea08fa2e100b8");
		List<Map> userList2city = new ArrayList();
		List<Map> userList3city = new ArrayList();
		List<Map> userList4city = new ArrayList();
		userList1city.add(m1);
		userList2city.add(m1);
		userList3city.add(m1);
		userList4city.add(m1);


		System.out.println("省==");
		System.out.println("usersList1--"+userList1);
		System.out.println("usersList2--"+userList2);
		System.out.println("userslist3--"+userList3);
		System.out.println("usersList4--"+userList4);
		System.out.println("地市");
		System.out.println("usersList1city--"+userList1city);
		System.out.println("usersList2city--"+userList2city);
		System.out.println("userslist3city--"+userList3city);
		System.out.println("usersList4city--"+userList4city);
		System.out.println("区县");
		System.out.println("usersList1country--"+userList1country);
		System.out.println("usersList2country--"+userList2country);
		System.out.println("userslist3country--"+userList3country);
		System.out.println("usersList4country--"+userList4country);

		String users1=(String) getUsers(userList1).get("userid");
		String users2=(String) getUsers(userList2).get("userid");
		String users3=(String) getUsers(userList3).get("userid");
		String users4=(String) getUsers(userList4).get("userid");
		String users1city=(String) getUsers(userList1city).get("userid");
		String users2city=(String) getUsers(userList2city).get("userid");
		String users3city=(String) getUsers(userList3city).get("userid");
		String users4city=(String) getUsers(userList4city).get("userid");
		String users1country=(String) getUsers(userList1country).get("userid");
		String users2country=(String) getUsers(userList2country).get("userid");
		String users3country=(String) getUsers(userList3country).get("userid");
		String users4country=(String) getUsers(userList4country).get("userid");
		System.out.println("users1--"+users1);
		System.out.println("users2--"+users2);
		System.out.println("users3--"+users3);
		System.out.println("users4--"+users4);
		System.out.println("users1city--"+users1city);
		System.out.println("users2city--"+users2city);
		System.out.println("users3city--"+users3city);
		System.out.println("users4city--"+users4city);
		System.out.println("users1country--"+users1country);
		System.out.println("users2country--"+users2country);
		System.out.println("users3country--"+users3country);
		System.out.println("users4country--"+users4country);

		String usersname1=(String) getUsers(userList1).get("username");
		String usersname2=(String) getUsers(userList2).get("username");
		String usersname3=(String) getUsers(userList3).get("username");
		String usersname4=(String) getUsers(userList4).get("username");
		String usersname1city=(String) getUsers(userList1city).get("username");
		String usersname2city=(String) getUsers(userList2city).get("username");
		String usersname3city=(String) getUsers(userList3city).get("username");
		String usersname4city=(String) getUsers(userList4city).get("username");
		String usersname1country=(String) getUsers(userList1country).get("username");
		String usersname2country=(String) getUsers(userList2country).get("username");
		String usersname3country=(String) getUsers(userList3country).get("username");
		String usersname4country=(String) getUsers(userList4country).get("username");

		String mobile1=(String) getUsers(userList1).get("mobile");
		String mobile2=(String) getUsers(userList2).get("mobile");
		String mobile3=(String) getUsers(userList3).get("mobile");
		String mobile4=(String) getUsers(userList4).get("mobile");
		String mobile1city=(String) getUsers(userList1city).get("mobile");
		String mobile2city=(String) getUsers(userList2city).get("mobile");
		String mobile3city=(String) getUsers(userList3city).get("mobile");
		String mobile4city=(String) getUsers(userList4city).get("mobile");
		String mobile1country=(String) getUsers(userList1country).get("mobile");
		String mobile2country=(String) getUsers(userList2country).get("mobile");
		String mobile3country=(String) getUsers(userList3country).get("mobile");
		String mobile4country=(String) getUsers(userList4country).get("mobile");

		System.out.println("mobile:"+mobile1city+","+mobile2city+","+mobile3city+","+mobile4city);
		Map smsMap=new HashMap();


		Map smsMapDB=new HashMap();
		Map smsMapDB1=new HashMap();
		Map smsMapDB2=new HashMap();
		Map smsMapDB3=new HashMap();
		Map smsMapDB4=new HashMap();

		smsMapDB.put("main", "main");
		smsMapDB.put("rule", "rule");
		smsMapDB.put("content", "content2");
		smsMapDB.put("record", "record");

		smsMapDB1.putAll(smsMapDB);
		smsMapDB1.put("usersarr", users1);
		smsMapDB1.put("usersarrPhone", mobile1);
		smsMapDB1.put("usersarrName", usersname1);
		smsMapDB1.put("usersarrcity", users1city);
		smsMapDB1.put("usersarrPhonecity", mobile1city);
		smsMapDB1.put("usersarrNamecity", usersname1city);
		smsMapDB1.put("usersarrcountry", users1country);
		smsMapDB1.put("usersarrPhonecountry", mobile1country);
		smsMapDB1.put("usersarrNamecountry", usersname1country);
		smsMapDB1.put("date", new Date());
		sendMessage(smsMapDB1);

		smsMapDB2.putAll(smsMapDB);
		smsMapDB2.put("usersarr", users2);
		smsMapDB2.put("usersarrPhone", mobile2);
		smsMapDB2.put("usersarrName", usersname2);
		smsMapDB2.put("usersarrcity", users2city);
		smsMapDB2.put("usersarrPhonecity", mobile2city);
		smsMapDB2.put("usersarrNamecity", usersname2city);
		smsMapDB2.put("usersarrcountry", users2country);
		smsMapDB2.put("usersarrPhonecountry", mobile2country);
		smsMapDB2.put("usersarrNamecountry", usersname2country);
		smsMapDB2.put("date", new Date());
		sendMessage(smsMapDB2);

		smsMapDB3.putAll(smsMapDB);
		smsMapDB3.put("usersarr", users3);
		smsMapDB3.put("usersarrPhone", mobile3);
		smsMapDB3.put("usersarrName", usersname3);
		smsMapDB3.put("usersarrcity", users3city);
		smsMapDB3.put("usersarrPhonecity", mobile3city);
		smsMapDB3.put("usersarrNamecity", usersname3city);
		smsMapDB3.put("usersarrcountry", users3country);
		smsMapDB3.put("usersarrPhonecountry", mobile3country);
		smsMapDB3.put("usersarrNamecountry", usersname3country);
		smsMapDB3.put("date", new Date());
		sendMessage(smsMapDB3);

		smsMapDB4.putAll(smsMapDB);
		smsMapDB4.put("usersarr", users4);
		smsMapDB4.put("usersarrPhone", mobile4);
		smsMapDB4.put("usersarrName", usersname4);
		smsMapDB4.put("usersarrcity", users4city);
		smsMapDB4.put("usersarrPhonecity", mobile4city);
		smsMapDB4.put("usersarrNamecity", usersname4city);
		smsMapDB4.put("usersarrcountry", users4country);
		smsMapDB4.put("usersarrPhonecountry", mobile4country);
		smsMapDB4.put("usersarrNamecountry", usersname4country);
		smsMapDB4.put("date", new Date());
		sendMessage(smsMapDB4);

	}

	public static Map getUsers(List userList){
		String userids = "";
		String usernames="";
		String mobiles="";
		if (userList != null && userList.size() > 0) {
			for (int i = 0; i < userList.size(); i++) {
				Map map = (Map) userList.get(i);
				if (map.get("userid") != null) {
					String userid = (String) map.get("userid");
					if (userid != null && !userid.equals("")) {
						String[] arr = userid.split(",");
						for (int j = 0; j < arr.length; j++) {
							userids += arr[j] + ",";
						}
					}
				}
				if(map.get("username")!=null){
					String username=(String) map.get("username");
					if(username!=null&&!"".equals(username)){
						String[] arr=username.split(",");
						for (int j = 0; j < arr.length; j++) {
							usernames += arr[j] + ",";
						}
					}
				}
				if(map.get("mobile")!=null){
					String mobile=(String) map.get("mobile");
					if(mobile!=null&&!"".equals(mobile)){
						String []arr=mobile.split(",");
						for(int j=0;j<arr.length;j++){
							mobiles+= arr[j] + ",";
						}
					}
				}
			}
			if (userids.endsWith(",")) {// 最后一个为逗号则去除
				userids = userids.substring(0, userids.lastIndexOf(","));
			}
			if (usernames.endsWith(",")) {// 最后一个为逗号则去除
				usernames = usernames.substring(0, usernames.lastIndexOf(","));
			}
			if (mobiles.endsWith(",")) {// 最后一个为逗号则去除
				mobiles = mobiles.substring(0, mobiles.lastIndexOf(","));
			}
		}
		Map map = new HashMap();
		map.put("userid", userids);
		map.put("username", usernames);
		map.put("mobile", mobiles);
		return map;
	}

	public static void sendMessage(Map map) throws Exception{

		String users=(String) map.get("usersarr");
		String mobile=(String) map.get("usersarrPhone");
		String usersname=(String)map.get("usersarrName");
		String userscity=(String) map.get("usersarrcity");
		String mobilecity=(String) map.get("usersarrPhonecity");
		String usersnamecity=(String)map.get("usersarrNamecity");
		String userscountry=(String) map.get("usersarrPhonecountry");
		String mobilecountry=(String) map.get("usersPhonearrcountry");
		String usersnamecountry=(String)map.get("usersarrNamecountry");

		String[]usersarr=(users+","+userscity+","+userscountry).split(",");
		String[]usersPhonearr=(mobile+","+mobilecity+","+mobilecountry).split(",");
		String[]usersNamearr=(usersname+","+usersnamecity+","+usersnamecountry).split(",");

		System.out.println("userarr:"+users+","+userscity+","+userscountry);
		System.out.println("usersPhonearr:"+mobile+","+mobilecity+","+mobilecountry);
		System.out.println("usersNamearr:"+usersname+","+usersnamecity+","+usersnamecountry);


		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Object main=(Object) map.get("main");
		Object rule=(Object) map.get("rule");
		Date date=(Date) map.get("date");
		String content=(String) map.get("content");

		for(int i=0;i<usersarr.length;i++){
			if (usersarr[i] != null && !usersarr[i].equals("")
					&& usersPhonearr[i] != null
					&& !usersPhonearr[i].equals("")) {

				if ("SMSIVR".contains("SMS")) {
					String id= "new ID";
					String insertSql = "insert into sms_monitor values ('"
							+ id + "','"
							+ "mainID" + "',null,'"
							+ "main.getSheetId()" + "','" + usersarr[i] + "','"
							+ usersPhonearr[i] + "',to_date('" + sdf.format(date)
							+ "','yyyy-mm-dd hh24:mi:ss'),'" + content + "',"
							+ "'true','false','0') ";
					Map smsRuleMap=new HashMap();
					smsRuleMap.put("mainAlarmGenre", "挂牌督办工单supervisetask");
					smsRuleMap.put("mainAlarmName", "record.getId()");
					smsRuleMap.put("startHour", "0");
					smsRuleMap.put("startMin", "0");
					smsRuleMap.put("endHour", "23");
					smsRuleMap.put("endMin", "59");
					smsRuleMap.put("startTime", "00:00:00");
					smsRuleMap.put("endTime", "23:59:00");
					String title="SuperviseTaskRecord";
					String sql2= "insert into sms_record values ('"+id+"','"+StaticMethod.nullObject2String("main.getId()")+"',"+
							"to_date('"+sdf.format(new Date())+"','yyyy-mm-dd hh24:mi:ss'),'"+StaticMethod.nullObject2String("rule.getCity()")+"',"+
							"'"+StaticMethod.nullObject2String("rule.getCountry()")+"','"+StaticMethod.nullObject2String(smsRuleMap.get("mainEquipmentFactory"))+"',"+
							"'"+StaticMethod.nullObject2String("rule.getMainNetSortOne()")+"','"+StaticMethod.nullObject2String("rule.getMainNetSortTwo()")+"',"+
							"'"+StaticMethod.nullObject2String("rule.getMainNetSortThree()")+"','"+StaticMethod.nullObject2String(smsRuleMap.get("mainAlarmGenre"))+"',"+
							"'"+StaticMethod.nullObject2String(smsRuleMap.get("mainAlarmName"))+"','"+StaticMethod.nullObject2String(smsRuleMap.get("startTime"))+"',"+
							"'"+StaticMethod.nullObject2String(smsRuleMap.get("endTime"))+"','"+StaticMethod.nullObject2String(smsRuleMap.get("mainFaultResponseLevel"))+"',"+
							0 + ",'"+usersarr[i]+"',"+
							"'"+usersNamearr[i]+"','"+usersPhonearr[i]+"',"+
							"'"+"main.getSheetId()"+"','"+title+"',"+
							"'"+content+"',to_date('"+sdf.format(date)+"','yyyy-mm-dd hh24:mi:ss'),0,"+
							StaticMethod.nullObject2int(smsRuleMap.get("startHour")) + "," +
							StaticMethod.nullObject2int(smsRuleMap.get("startMin")) + "," +
							StaticMethod.nullObject2int(smsRuleMap.get("endHour")) + "," +
							StaticMethod.nullObject2int(smsRuleMap.get("endMin")) +
							") ";

					try {
						System.out.println(insertSql);
						System.out.println(sql2);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if ("SMSIVR".contains("IVR")) {
					String insertSql = "insert into complaint_sms(id,CUSTOMERCONTACT,COMPLAINTDESC,CREATETIME,IFLOAD,sheetid,sendtime,TASKSERVICEID,TASKSERVICETYPE,HMFlag)values ('"
							+ "UUIDHexGenerator.getInstance().getID()" //id
							+ "','"
							+ usersPhonearr[i] //CUSTOMERCONTACT
							+ "','"
							+ content //COMPLAINTDESC
							+ "',to_date('"
							+ StaticMethod.getCurrentDateTime() //CREATETIME
							+ "','yyyy-MM-dd hh24:mi:ss'),'0','" //IFLOAD
							+ "main.getSheetId()" //sheetid
							+ "',to_date('"
							+ sdf.format(date) //sendtime
							+ "','yyyy-MM-dd hh24:mi:ss'),'"
							+ "main.getSheetId()" //TASKSERVICEID
							+ "','" + 0 //TASKSERVICETYPE
							+ "','" + "Y" //HMFlag
							+ "')";
					try {
						System.out.println(insertSql);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}

	}
}
