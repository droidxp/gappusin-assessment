public class org.anddev.andengine.engine.camera.hud.controls.DigitalOnScreenControl extends org.anddev.andengine.engine.camera.hud.controls.BaseOnScreenControl {
	 /* # static fields */
	 private static final Float ANGLE_DELTA;
	 private static final Float EXTENT_DIAGONAL;
	 private static final Float EXTENT_SIDE;
	 /* # instance fields */
	 private Boolean mAllowDiagonal;
	 /* # direct methods */
	 public org.anddev.andengine.engine.camera.hud.controls.DigitalOnScreenControl ( ) {
		 /* .locals 9 */
		 int v7 = 0; // const/4 v7, 0x0
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* move-object v5, p5 */
		 /* move v6, p6 */
		 /* move-object/from16 v8, p7 */
		 /* invoke-direct/range {v0 ..v8}, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;-><init>(FFLorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/opengl/texture/region/TextureRegion;Lorg/anddev/andengine/opengl/texture/region/TextureRegion;FZLorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl$IOnScreenControlListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.camera.hud.controls.DigitalOnScreenControl ( ) {
		 /* .locals 8 */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* move-object v5, p5 */
		 /* move v6, p6 */
		 /* move-object/from16 v7, p8 */
		 /* invoke-direct/range {v0 ..v7}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;-><init>(FFLorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/opengl/texture/region/TextureRegion;Lorg/anddev/andengine/opengl/texture/region/TextureRegion;FLorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl$IOnScreenControlListener;)V */
		 /* iput-boolean p7, p0, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->mAllowDiagonal:Z */
		 return;
	 } // .end method
	 private Boolean testDiagonalAngle ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 /* const/high16 v1, 0x41b40000 # 22.5f */
		 /* sub-float v0, p1, v1 */
		 /* cmpl-float v0, p2, v0 */
		 /* if-lez v0, :cond_0 */
		 /* add-float v0, p1, v1 */
		 /* cmpg-float v0, p2, v0 */
		 /* if-gez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public Boolean isAllowDiagonal ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->mAllowDiagonal:Z */
} // .end method
protected void onUpdateControlKnob ( Float p0, Float p1 ) {
/* .locals 7 */
/* const/high16 v6, 0x3f000000 # 0.5f */
/* const v5, 0x3eb53f7d # 0.354f */
/* const/high16 v4, -0x41000000 # -0.5f */
/* const v3, -0x414ac083 # -0.354f */
int v2 = 0; // const/4 v2, 0x0
/* cmpl-float v0, p1, v2 */
/* if-nez v0, :cond_1 */
/* cmpl-float v0, p2, v2 */
/* if-nez v0, :cond_1 */
/* invoke-super {p0, v2, v2}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->mAllowDiagonal:Z */
if ( v0 != null) { // if-eqz v0, :cond_b
v0 = org.anddev.andengine.util.MathUtils .atan2 ( p2,p1 );
v0 = org.anddev.andengine.util.MathUtils .radToDeg ( v0 );
/* const/high16 v1, 0x43340000 # 180.0f */
/* add-float/2addr v0, v1 */
v1 = /* invoke-direct {p0, v2, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->testDiagonalAngle(FF)Z */
/* if-nez v1, :cond_2 */
/* const/high16 v1, 0x43b40000 # 360.0f */
v1 = /* invoke-direct {p0, v1, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->testDiagonalAngle(FF)Z */
if ( v1 != null) { // if-eqz v1, :cond_3
} // :cond_2
/* invoke-super {p0, v4, v2}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
} // :cond_3
/* const/high16 v1, 0x42340000 # 45.0f */
v1 = /* invoke-direct {p0, v1, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->testDiagonalAngle(FF)Z */
if ( v1 != null) { // if-eqz v1, :cond_4
/* invoke-super {p0, v3, v3}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
} // :cond_4
/* const/high16 v1, 0x42b40000 # 90.0f */
v1 = /* invoke-direct {p0, v1, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->testDiagonalAngle(FF)Z */
if ( v1 != null) { // if-eqz v1, :cond_5
/* invoke-super {p0, v2, v4}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
} // :cond_5
/* const/high16 v1, 0x43070000 # 135.0f */
v1 = /* invoke-direct {p0, v1, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->testDiagonalAngle(FF)Z */
if ( v1 != null) { // if-eqz v1, :cond_6
/* invoke-super {p0, v5, v3}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
} // :cond_6
/* const/high16 v1, 0x43340000 # 180.0f */
v1 = /* invoke-direct {p0, v1, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->testDiagonalAngle(FF)Z */
if ( v1 != null) { // if-eqz v1, :cond_7
/* invoke-super {p0, v6, v2}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
} // :cond_7
/* const/high16 v1, 0x43610000 # 225.0f */
v1 = /* invoke-direct {p0, v1, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->testDiagonalAngle(FF)Z */
if ( v1 != null) { // if-eqz v1, :cond_8
/* invoke-super {p0, v5, v5}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
} // :cond_8
/* const/high16 v1, 0x43870000 # 270.0f */
v1 = /* invoke-direct {p0, v1, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->testDiagonalAngle(FF)Z */
if ( v1 != null) { // if-eqz v1, :cond_9
/* invoke-super {p0, v2, v6}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
} // :cond_9
/* const v1, 0x439d8000 # 315.0f */
v0 = /* invoke-direct {p0, v1, v0}, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->testDiagonalAngle(FF)Z */
if ( v0 != null) { // if-eqz v0, :cond_a
/* invoke-super {p0, v3, v5}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
} // :cond_a
/* invoke-super {p0, v2, v2}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
} // :cond_b
v0 = java.lang.Math .abs ( p1 );
v1 = java.lang.Math .abs ( p2 );
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_e */
/* cmpl-float v0, p1, v2 */
/* if-lez v0, :cond_c */
/* invoke-super {p0, v6, v2}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
/* goto/16 :goto_0 */
} // :cond_c
/* cmpg-float v0, p1, v2 */
/* if-gez v0, :cond_d */
/* invoke-super {p0, v4, v2}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
/* goto/16 :goto_0 */
} // :cond_d
/* cmpl-float v0, p1, v2 */
/* if-nez v0, :cond_0 */
/* invoke-super {p0, v2, v2}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
/* goto/16 :goto_0 */
} // :cond_e
/* cmpl-float v0, p2, v2 */
/* if-lez v0, :cond_f */
/* invoke-super {p0, v2, v6}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
/* goto/16 :goto_0 */
} // :cond_f
/* cmpg-float v0, p2, v2 */
/* if-gez v0, :cond_10 */
/* invoke-super {p0, v2, v4}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
/* goto/16 :goto_0 */
} // :cond_10
/* cmpl-float v0, p2, v2 */
/* if-nez v0, :cond_0 */
/* invoke-super {p0, v2, v2}, Lorg/anddev/andengine/engine/camera/hud/controls/BaseOnScreenControl;->onUpdateControlKnob(FF)V */
/* goto/16 :goto_0 */
} // .end method
public void setAllowDiagonal ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lorg/anddev/andengine/engine/camera/hud/controls/DigitalOnScreenControl;->mAllowDiagonal:Z */
return;
} // .end method
