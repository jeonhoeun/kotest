package com.jeonhoeun.domain.logger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Logger @Inject constructor(){
    val logs = ArrayList<String>()
    fun log(msg:String,_tag:String){
        logs.add(if(_tag.isEmpty()){msg}else{"[$_tag] $msg"})
        if( logs.size>100){
            logs.removeAt(0)
        }
    }
}