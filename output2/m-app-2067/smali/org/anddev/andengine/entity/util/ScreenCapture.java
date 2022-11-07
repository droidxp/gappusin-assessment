public class org.anddev.andengine.entity.util.ScreenCapture extends org.anddev.andengine.entity.Entity implements org.anddev.andengine.entity.util.ScreenGrabber$IScreenGrabberCallback {
	 /* # interfaces */
	 /* # instance fields */
	 private java.lang.String mFilePath;
	 private org.anddev.andengine.entity.util.ScreenCapture$IScreenCaptureCallback mScreenCaptureCallback;
	 private final org.anddev.andengine.entity.util.ScreenGrabber mScreenGrabber;
	 /* # direct methods */
	 public org.anddev.andengine.entity.util.ScreenCapture ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/Entity;-><init>()V */
		 /* new-instance v0, Lorg/anddev/andengine/entity/util/ScreenGrabber; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/entity/util/ScreenGrabber;-><init>()V */
		 this.mScreenGrabber = v0;
		 return;
	 } // .end method
	 private static void saveCapture ( android.graphics.Bitmap p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 /* new-instance v1, Ljava/io/FileOutputStream; */
			 /* invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V */
			 /* :try_end_0 */
			 /* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 try { // :try_start_1
				 v0 = android.graphics.Bitmap$CompressFormat.PNG;
				 /* const/16 v2, 0x64 */
				 (( android.graphics.Bitmap ) p0 ).compress ( v0, v2, v1 ); // invoke-virtual {p0, v0, v2, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
				 /* :try_end_1 */
				 /* .catch Ljava/io/FileNotFoundException; {:try_start_1 ..:try_end_1} :catch_1 */
				 return;
				 /* :catch_0 */
				 /* move-exception v1 */
				 /* move-object v3, v1 */
				 /* move-object v1, v0 */
				 /* move-object v0, v3 */
			 } // :goto_0
			 org.anddev.andengine.util.StreamUtils .flushCloseStream ( v1 );
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 final String v2 = "Error saving file to: "; // const-string v2, "Error saving file to: "
			 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 org.anddev.andengine.util.Debug .e ( v1,v0 );
			 /* throw v0 */
			 /* :catch_1 */
			 /* move-exception v0 */
		 } // .end method
		 /* # virtual methods */
		 public void capture ( Integer p0, Integer p1, Integer p2, Integer p3, java.lang.String p4, org.anddev.andengine.entity.util.ScreenCapture$IScreenCaptureCallback p5 ) {
			 /* .locals 6 */
			 this.mFilePath = p5;
			 this.mScreenCaptureCallback = p6;
			 v0 = this.mScreenGrabber;
			 /* move v1, p1 */
			 /* move v2, p2 */
			 /* move v3, p3 */
			 /* move v4, p4 */
			 /* move-object v5, p0 */
			 /* invoke-virtual/range {v0 ..v5}, Lorg/anddev/andengine/entity/util/ScreenGrabber;->grab(IIIILorg/anddev/andengine/entity/util/ScreenGrabber$IScreenGrabberCallback;)V */
			 return;
		 } // .end method
		 public void capture ( Integer p0, Integer p1, java.lang.String p2, org.anddev.andengine.entity.util.ScreenCapture$IScreenCaptureCallback p3 ) {
			 /* .locals 7 */
			 int v1 = 0; // const/4 v1, 0x0
			 /* move-object v0, p0 */
			 /* move v2, v1 */
			 /* move v3, p1 */
			 /* move v4, p2 */
			 /* move-object v5, p3 */
			 /* move-object v6, p4 */
			 /* invoke-virtual/range {v0 ..v6}, Lorg/anddev/andengine/entity/util/ScreenCapture;->capture(IIIILjava/lang/String;Lorg/anddev/andengine/entity/util/ScreenCapture$IScreenCaptureCallback;)V */
			 return;
		 } // .end method
		 protected void onManagedDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
			 /* .locals 1 */
			 v0 = this.mScreenGrabber;
			 (( org.anddev.andengine.entity.util.ScreenGrabber ) v0 ).onManagedDraw ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/anddev/andengine/entity/util/ScreenGrabber;->onManagedDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
			 return;
		 } // .end method
		 protected void onManagedUpdate ( Float p0 ) {
			 /* .locals 0 */
			 return;
		 } // .end method
		 public void onScreenGrabFailed ( java.lang.Exception p0 ) {
			 /* .locals 2 */
			 v0 = this.mScreenCaptureCallback;
			 v1 = this.mFilePath;
			 return;
		 } // .end method
		 public void onScreenGrabbed ( android.graphics.Bitmap p0 ) {
			 /* .locals 3 */
			 try { // :try_start_0
				 v0 = this.mFilePath;
				 org.anddev.andengine.entity.util.ScreenCapture .saveCapture ( p1,v0 );
				 v0 = this.mScreenCaptureCallback;
				 v1 = this.mFilePath;
				 /* :try_end_0 */
				 /* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :goto_0
			 return;
			 /* :catch_0 */
			 /* move-exception v0 */
			 v1 = this.mScreenCaptureCallback;
			 v2 = this.mFilePath;
		 } // .end method
		 public void reset ( ) {
			 /* .locals 0 */
			 return;
		 } // .end method
