/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.web.util;

import org.apache.commons.lang3.StringEscapeUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class HtmlUtilsTest.
 * 
 * @author feilong
 * @version 1.0.7 2014-6-25 16:25:26
 */
public class HtmlUtilsTest{

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(HtmlUtilsTest.class);

    /** The a. */
    String                      a      = "m&eacute;n&nbsp;";

    /**
     * Test html utils.
     */
    @Test
    public void testHtmlUtils(){
        String specialStr = "<div id=\"testDiv\">test1;test2</div>";
        String str1 = HtmlUtils.htmlEscape(specialStr); // ①将 HTML 特殊字符转义为 HTML 通用转义序列;
        LOGGER.info(str1);

        String str2 = HtmlUtils.htmlEscapeDecimal(specialStr);// 将 HTML 特殊字符转义为带 # 的十进制数据转义序列;
        LOGGER.info(str2);

        String str3 = HtmlUtils.htmlEscapeHex(specialStr);// 将 HTML 特殊字符转义为带 # 的十六进制数据转义序列;
        LOGGER.info(str3);

        // ④下面对转义后字符串进行反向操作
        LOGGER.info(HtmlUtils.htmlUnescape(str1));
        LOGGER.info(HtmlUtils.htmlUnescape(str2));
        LOGGER.info(HtmlUtils.htmlUnescape(str3));

        LOGGER.info(StringEscapeUtils.unescapeHtml4(str1));
        LOGGER.info(StringEscapeUtils.unescapeHtml4(str2));
        LOGGER.info(StringEscapeUtils.unescapeHtml4(str3));

        LOGGER.info(org.apache.commons.lang.StringEscapeUtils.unescapeHtml(str1));
        LOGGER.info(org.apache.commons.lang.StringEscapeUtils.unescapeHtml(str2));
        LOGGER.info(org.apache.commons.lang.StringEscapeUtils.unescapeHtml(str3));
    }

    /**
     * Html unescape.
     */
    @Test
    public void htmlUnescape(){
        LOGGER.info(HtmlUtils.htmlUnescape(a));
    }

    /**
     * String escape utils.
     */
    @Test
    public void stringEscapeUtils(){
        LOGGER.info(StringEscapeUtils.unescapeHtml4(a));
    }

    /**
     * String escape utils2.
     */
    @Test
    public void stringEscapeUtils2(){
        LOGGER.info(org.apache.commons.lang.StringEscapeUtils.unescapeHtml(a));
    }
}
