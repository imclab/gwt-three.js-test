package com.akjava.gwt.three.client.objects;

import com.akjava.gwt.three.client.materials.Material;

public class MorphAnimMesh extends Mesh{
	protected MorphAnimMesh(){}
	
	public final native void updateAnimation(long delta)/*-{	
	this.updateAnimation(delta);
	}-*/;

	public final native void setDuration(int time)/*-{
	this.duration=time;
	}-*/;
	
	public final native void setTime(int time)/*-{
	this.time=time;
	}-*/;
	public final native void seMirrordLoop(boolean mirroredLoop)/*-{
	this.mirroredLoop=mirroredLoop;
	}-*/;
}
