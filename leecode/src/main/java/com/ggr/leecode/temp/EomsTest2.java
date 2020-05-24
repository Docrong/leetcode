package com.ggr.leecode.temp;

import com.ggr.leecode.util.StaticMethod;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : gr
 * @date : 2019/12/19 14:12
 */
public class EomsTest2 {
	public static void main(String[] args) {
		String[]usersarr=(",8a998abc94888ba118105210dc5cb941,").split(",");
		String[]usersPhonearr=(",13907984040,").split(",");
		String[]usersNamearr=(",王建平,").split(",");

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for(int i=0;i<usersarr.length;i++){
			if (usersarr[i] != null && !usersarr[i].equals("")
					&& usersPhonearr[i] != null
					&& !usersPhonearr[i].equals("")) {

				if ("SMSIVR".contains("SMS")) {
					String insertSql = "insert into sms_monitor values ('"
							+ "id" + "','"
							+ "main.getSheetId()" + "',null,'"
							+ "main.getSheetId()" + "','" + usersarr[i] + "','"
							+ usersPhonearr[i] + "',to_date('" + sdf.format(date)
							+ "','yyyy-mm-dd hh24:mi:ss'),'" + "content" + "',"
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
					String sql2= "insert into sms_record values ('"+"id"+"','"+StaticMethod.nullObject2String("main.getId()")+"',"+
							"to_date('"+sdf.format(new Date())+"','yyyy-mm-dd hh24:mi:ss'),'"+StaticMethod.nullObject2String("rule.getCity()")+"',"+
							"'"+StaticMethod.nullObject2String("rule.getCountry()")+"','"+StaticMethod.nullObject2String(smsRuleMap.get("mainEquipmentFactory"))+"',"+
							"'"+StaticMethod.nullObject2String("rule.getMainNetSortOne()")+"','"+StaticMethod.nullObject2String("rule.getMainNetSortTwo()")+"',"+
							"'"+StaticMethod.nullObject2String("rule.getMainNetSortThree()")+"','"+StaticMethod.nullObject2String(smsRuleMap.get("mainAlarmGenre"))+"',"+
							"'"+StaticMethod.nullObject2String(smsRuleMap.get("mainAlarmName"))+"','"+StaticMethod.nullObject2String(smsRuleMap.get("startTime"))+"',"+
							"'"+StaticMethod.nullObject2String(smsRuleMap.get("endTime"))+"','"+StaticMethod.nullObject2String(smsRuleMap.get("mainFaultResponseLevel"))+"',"+
							0 + ",'"+usersarr[i]+"',"+
							"'"+usersNamearr[i]+"','"+usersPhonearr[i]+"',"+
							"'"+"main.getSheetId()"+"','"+title+"',"+
							"'"+"content"+"',to_date('"+sdf.format(date)+"','yyyy-mm-dd hh24:mi:ss'),0,"+
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
							+ "content" //COMPLAINTDESC
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
					System.out.println( "插入短信语音sql1" + insertSql);
					try {
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
