public class org.anddev.andengine.entity.util.ScreenGrabber extends org.anddev.andengine.entity.Entity {
	 /* # instance fields */
	 private Integer mGrabHeight;
	 private Integer mGrabWidth;
	 private Integer mGrabX;
	 private Integer mGrabY;
	 private org.anddev.andengine.entity.util.ScreenGrabber$IScreenGrabberCallback mScreenGrabCallback;
	 private Boolean mScreenGrabPending;
	 /* # direct methods */
	 public org.anddev.andengine.entity.util.ScreenGrabber ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/Entity;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/util/ScreenGrabber;->mScreenGrabPending:Z */
		 return;
	 } // .end method
	 private static android.graphics.Bitmap grab ( Integer p0, Integer p1, Integer p2, Integer p3, javax.microedition.khronos.opengles.GL10 p4 ) {
		 /* .locals 10 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* add-int v0, p1, p3 */
		 /* mul-int/2addr v0, p2 */
		 /* new-array v8, v0, [I */
		 java.nio.IntBuffer .wrap ( v8 );
		 (( java.nio.IntBuffer ) v7 ).position ( v2 ); // invoke-virtual {v7, v2}, Ljava/nio/IntBuffer;->position(I)Ljava/nio/Buffer;
		 /* add-int v4, p1, p3 */
		 /* const/16 v5, 0x1908 */
		 /* const/16 v6, 0x1401 */
		 /* move-object v0, p4 */
		 /* move v1, p0 */
		 /* move v3, p2 */
		 /* invoke-interface/range {v0 ..v7}, Ljavax/microedition/khronos/opengles/GL10;->glReadPixels(IIIIIILjava/nio/Buffer;)V */
		 /* mul-int v0, p2, p3 */
		 /* new-array v0, v0, [I */
		 /* move v1, v2 */
	 } // :goto_0
	 /* if-lt v1, p3, :cond_0 */
	 v1 = android.graphics.Bitmap$Config.ARGB_8888;
	 android.graphics.Bitmap .createBitmap ( v0,p2,p3,v1 );
} // :cond_0
/* move v3, v2 */
} // :goto_1
/* if-lt v3, p2, :cond_1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
/* add-int v4, p1, v1 */
/* mul-int/2addr v4, p2 */
/* add-int/2addr v4, v3 */
/* aget v4, v8, v4 */
/* const/high16 v5, 0xff0000 */
/* and-int/2addr v5, v4 */
/* shr-int/lit8 v5, v5, 0x10 */
/* and-int/lit16 v6, v4, 0xff */
/* shl-int/lit8 v6, v6, 0x10 */
/* const v7, -0xff0100 */
/* and-int/2addr v4, v7 */
/* sub-int v7, p3, v1 */
int v9 = 1; // const/4 v9, 0x1
/* sub-int/2addr v7, v9 */
/* mul-int/2addr v7, p2 */
/* add-int/2addr v7, v3 */
/* or-int/2addr v4, v6 */
/* or-int/2addr v4, v5 */
/* aput v4, v0, v7 */
/* add-int/lit8 v3, v3, 0x1 */
} // .end method
/* # virtual methods */
public void grab ( Integer p0, Integer p1, Integer p2, Integer p3, org.anddev.andengine.entity.util.ScreenGrabber$IScreenGrabberCallback p4 ) {
/* .locals 1 */
/* iput p1, p0, Lorg/anddev/andengine/entity/util/ScreenGrabber;->mGrabX:I */
/* iput p2, p0, Lorg/anddev/andengine/entity/util/ScreenGrabber;->mGrabY:I */
/* iput p3, p0, Lorg/anddev/andengine/entity/util/ScreenGrabber;->mGrabWidth:I */
/* iput p4, p0, Lorg/anddev/andengine/entity/util/ScreenGrabber;->mGrabHeight:I */
this.mScreenGrabCallback = p5;
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/util/ScreenGrabber;->mScreenGrabPending:Z */
return;
} // .end method
public void grab ( Integer p0, Integer p1, org.anddev.andengine.entity.util.ScreenGrabber$IScreenGrabberCallback p2 ) {
/* .locals 6 */
int v1 = 0; // const/4 v1, 0x0
/* move-object v0, p0 */
/* move v2, v1 */
/* move v3, p1 */
/* move v4, p2 */
/* move-object v5, p3 */
/* invoke-virtual/range {v0 ..v5}, Lorg/anddev/andengine/entity/util/ScreenGrabber;->grab(IIIILorg/anddev/andengine/entity/util/ScreenGrabber$IScreenGrabberCallback;)V */
return;
} // .end method
protected void onManagedDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
/* .locals 4 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/util/ScreenGrabber;->mScreenGrabPending:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
try { // :try_start_0
/* iget v0, p0, Lorg/anddev/andengine/entity/util/ScreenGrabber;->mGrabX:I */
/* iget v1, p0, Lorg/anddev/andengine/entity/util/ScreenGrabber;->mGrabY:I */
/* iget v2, p0, Lorg/anddev/andengine/entity/util/ScreenGrabber;->mGrabWidth:I */
/* iget v3, p0, Lorg/anddev/andengine/entity/util/ScreenGrabber;->mGrabHeight:I */
org.anddev.andengine.entity.util.ScreenGrabber .grab ( v0,v1,v2,v3,p1 );
v1 = this.mScreenGrabCallback;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/util/ScreenGrabber;->mScreenGrabPending:Z */
} // :cond_0
return;
/* :catch_0 */
/* move-exception v0 */
v1 = this.mScreenGrabCallback;
} // .end method
protected void onManagedUpdate ( Float p0 ) {
/* .locals 0 */
return;
} // .end method
public void reset ( ) {
/* .locals 0 */
return;
} // .end method
