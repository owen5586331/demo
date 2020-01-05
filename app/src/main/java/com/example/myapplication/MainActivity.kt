package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.perfmonitor.base.SaveHelper
import tv.athena.util.RuntimeInfo
import java.io.FileOutputStream
import java.io.OutputStream

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RuntimeInfo.sAppContext = application
    }

    fun readMuch(view: View) {

        val file = SaveHelper.getSaveFile(TAG)

        file?.let {

            //            for (i in 1..10) {
            it.readText()
//            }
//            fos.close();//关闭文件句柄 释放资源.
        }
    }

    fun writeMuch(view: View) {

        val file = SaveHelper.getSaveFile(TAG)
        file?.let {
            //            val time = System.currentTimeMillis()
            val fos: OutputStream = FileOutputStream(it, true); //append 默认写true 表示写入内容追加到文件末尾。
//            val outputStringBuilder = StringBuilder()
//            for (i in 1..1000) {
//                outputStringBuilder.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
//            }
//            val tmp = outputStringBuilder.toString().toByteArray()
            for (i in 1..1000000) {
            fos.write("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".toByteArray())
            fos.flush()
            }
//            fos.close(); //关闭文件句柄 释放资源.
        }
    }


}
