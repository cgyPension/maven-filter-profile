package com.cgy.utils

import java.util.ResourceBundle

/**
 * 获取配置文件工具类
 */
object PropertiesUtil {

    // 绑定配置文件
    // ResourceBundle专门用于读取配置文件，所以读取时，不需要增加扩展名
    // 国际化 = I18N => Properties
    //val project: ResourceBundle = ResourceBundle.getBundle("config")
    val project: ResourceBundle = ResourceBundle.getBundle("dev/config")

    def getValue( key : String ): String = {
        project.getString(key)
    }

    def main(args: Array[String]): Unit = {

        println(getValue("kafka.broker.list"))

    }
}
