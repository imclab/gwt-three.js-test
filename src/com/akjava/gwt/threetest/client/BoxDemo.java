/*
 * Copyright (C) 2011 aki@akjava.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.akjava.gwt.threetest.client;

import com.akjava.gwt.three.client.THREE;
import com.akjava.gwt.three.client.cameras.Camera;
import com.akjava.gwt.three.client.lights.Light;
import com.akjava.gwt.three.client.objects.Mesh;
import com.akjava.gwt.three.client.renderers.WebGLRenderer;
import com.akjava.gwt.three.client.scenes.Scene;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.FocusPanel;

public class BoxDemo extends AbstractDemo{

	@Override
	public void start(final WebGLRenderer renderer,final int width,final int height,FocusPanel panel) {

		final Camera camera=THREE.PerspectiveCamera(35,(double)width/height,.1,10000);
		camera.getPosition().set(0, 0, 20);
		
		
		
		final Scene scene=THREE.Scene();
		
		final Mesh mesh=THREE.Mesh(THREE.CubeGeometry(5, 5, 5), 
				THREE.MeshLambertMaterial().color(0xff0000).build());
		scene.add(mesh);
		
		final Light light=THREE.PointLight(0xffffff);
		light.setPosition(10, 0, 10);
		scene.add(light);
		
		
		timer = new Timer(){
			public void run(){
				MainWidget.stats.update();
				//turn around;
				mesh.getRotation().incrementX(0.02);
				mesh.getRotation().incrementY(0.02);
				
				renderer.render(scene, camera);
			}
		};
		
		
		startTimer();
	}



	@Override
	public String getName() {
		return "Simple Cube";
	}

}