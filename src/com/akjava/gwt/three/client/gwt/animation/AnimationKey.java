package com.akjava.gwt.three.client.gwt.animation;

import com.akjava.gwt.three.client.core.Quaternion;
import com.akjava.gwt.three.client.core.Vector3;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

public class AnimationKey extends JavaScriptObject {
	protected AnimationKey(){}
	public native final double getTime()/*-{
	return this['time'];
	}-*/;

	public native final void setTime(double time)/*-{
	this['time']=time;
	}-*/;
	
	
	public final void setPos(Vector3 vec){
		setPos(vec.getX(),vec.getY(),vec.getZ());
	}
	public native final void setPos(double x,double y,double z)/*-{
	this['pos']=[x,y,z];
	}-*/;
	
	/*
	 * sometime it's empty
	 */
	public native final JsArrayNumber getPos()/*-{
	return this['pos'];
	}-*/;
	
	public native final void setScl(double x,double y,double z)/*-{
	this['scl']=[x,y,z];
	}-*/;
	
	/*
	 * sometime it's empty
	 */
	public native final JsArrayNumber getScl()/*-{
	return this['scl'];
	}-*/;
	

	public native final Quaternion getRot()/*-{
	return this['rot'];
	}-*/;

	public native final void setRot(Quaternion rot)/*-{
	this['rot']=rot;
	}-*/;
}