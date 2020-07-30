package org.andot.data.j2cube.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveHtmlTest {
    public static void main(String[] args) {
        String s = "标题:<h1><span class=\"ql-size-small\" style=\"color: black;\">勃朗圣泉补水保湿喷雾护肤收敛水爽肤水 舒缓修护敏感肌儿童可用<span class=\"ql-cursor\">\uFEFF</span></span></h1>\n" +
                "辅助文字:";
        Pattern p_script=Pattern.compile("<[^>]*?>", Pattern.CASE_INSENSITIVE);
        Matcher m_script=p_script.matcher(s);
        System.err.println(m_script.replaceAll(""));
        System.err.println(m_script.replaceAll("").substring(0, 10));
        //str.replace(/<[^>]+>/g,"");
    }
}
