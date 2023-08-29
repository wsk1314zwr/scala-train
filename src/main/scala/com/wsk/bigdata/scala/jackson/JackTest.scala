package com.wsk.bigdata.scala.jackson

import java.io.ByteArrayInputStream
import org.codehaus.jackson.JsonFactory

object JackTest {
    def main(args: Array[String]): Unit = {
        val str:String = "{\"operator_name\":\"5887徐凡\",\"flag\":\"start\",\"inner_id\":1,\"operator_id\":537,\"store_time\":1519799748000,\"skill_id\":59,\"close_reason\":\"chaterLogout\",\"msg_id\":3050978,\"content\":\"<he tm=\\\"1519799585522\\\">nihao</he><I tm=\\\"1519799588305\\\"><span style=\\\"font-family: Tahoma;mso-ascii-theme-font: minor-fareast;color: rgb(0,0,255);font-weight: bold;font-style: normal;\\\">您  好，在  的哦   ~，有什么需要帮助的吗？</span></I><I tm=\\\"1519799588636\\\"><span style=\\\"font-family: Tahoma;mso-ascii-theme-font: minor-fareast;color: rgb(0,0,255);font-weight: bold;font-style: normal;\\\">您好~</span></I><he tm=\\\"1519799629760\\\">请问下2017年奖金在哪里申报呢</he><he tm=\\\"1519799648774\\\">是在全年一次性奖金收入吗</he><I tm=\\\"1519799651330\\\" to=\\\"60\\\"><span>步骤一：请您点击软件左侧报表填写&rarr;&rarr;扣缴所得税报告表&rarr;&rarr;管理表单，点击工资薪金前面的+号，勾选&ldquo;全年一次性奖金收入&rdquo;这张表；<br />步骤二：请您点击软件左侧报表填写&rarr;&rarr;扣缴所得税报告表&rarr;&rarr;全年一次性奖金收入&rarr;&rarr;填写&rarr;&rarr;添加，填写相应收入保存就可以了。<br />具体操作请参考右侧图示：<br />重要提醒：需要申报全年奖的人员，一定要先填写当月正常工资薪金表，如果当月没有工资，可以生成零工资后再填写全年奖，最后两张报表一起发送就可以了。<br /></span>[p4消息：https://helper.4007112366.com/robot/p4data/08a48c72790749eca71b74572e0042bd]</I><I tm=\\\"1519799653781\\\"><span>是的呢</span></I><he tm=\\\"1519799675761\\\">好的，谢谢哈</he><I tm=\\\"1519799701666\\\"><span>不客气的，这是我们应该做的。</span></I><I tm=\\\"1519799707426\\\"><span>为了更好的跟踪服务效果，请您稍后关闭聊天窗口时对我的服务做出评价！非常感谢您<img border=\\\"0\\\" src=\\\"https://olhelp.servyou.com.cn/online/downloadserver?fid=/chatClient/emotion/define/9005/1510708201678/&amp;act=2&amp;isAbleZip=0&amp;fna=15107082016780.png&amp;a=1?t=1175093\\\" /><br /></span></I>\",\"close_name\":\"上海仁建投资有限公司\"}"
//        val str:String = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }"
        val jsonFactory = new JsonFactory
        //JSON_FACTORY.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        //JSON_FACTORY.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, true);
        //JSON_FACTORY.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
        //JSON_FACTORY.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);
        //JSON_FACTORY.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);

        val parser = jsonFactory.createJsonParser(str)
//        while ( {
//            !parser.isClosed
//        }) {
//            val jsonToken = parser.nextToken
//            System.out.println("jsonToken = " + jsonToken)
//        }
//val jsonToken = parser.nextToken
val str1 = parser.getText()
        val value = parser.getBinaryValue
        println(value)


    }
}
