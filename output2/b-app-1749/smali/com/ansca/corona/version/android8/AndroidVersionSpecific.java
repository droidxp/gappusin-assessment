public class com.ansca.corona.version.android8.AndroidVersionSpecific implements com.ansca.corona.version.IAndroidVersionSpecific {
	 /* .source "AndroidVersionSpecific.java" */
	 /* # interfaces */
	 /* # direct methods */
	 public com.ansca.corona.version.android8.AndroidVersionSpecific ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 18 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer apiVersion ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 22 */
		 /* const/16 v0, 0x8 */
	 } // .end method
	 public Integer audioChannelMono ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 43 */
		 /* const/16 v0, 0x10 */
	 } // .end method
	 public com.ansca.corona.version.ISurfaceView createCoronaGLSurfaceView ( com.ansca.corona.CoronaActivity p0 ) {
		 /* .locals 1 */
		 /* .param p1, "activity" # Lcom/ansca/corona/CoronaActivity; */
		 /* .prologue */
		 /* .line 38 */
		 /* new-instance v0, Lcom/ansca/corona/version/android8/CoronaGLSurfaceView; */
		 /* invoke-direct {v0, p1}, Lcom/ansca/corona/version/android8/CoronaGLSurfaceView;-><init>(Lcom/ansca/corona/CoronaActivity;)V */
	 } // .end method
	 public Integer inputTypeFlagsNoSuggestions ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 80 */
		 /* const/high16 v0, 0x80000 */
	 } // .end method
	 public Integer motionEventACTION_POINTER_DOWN ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 76 */
		 int v0 = 5; // const/4 v0, 0x5
	 } // .end method
	 public Integer motionEventACTION_POINTER_UP ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 77 */
		 int v0 = 6; // const/4 v0, 0x6
	 } // .end method
	 public Integer motionEventGetAction ( android.view.MotionEvent p0 ) {
		 /* .locals 1 */
		 /* .param p1, "event" # Landroid/view/MotionEvent; */
		 /* .prologue */
		 /* .line 48 */
		 v0 = 		 (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
		 /* and-int/lit16 v0, v0, 0xff */
	 } // .end method
	 public Integer motionEventGetActionIndex ( android.view.MotionEvent p0 ) {
		 /* .locals 1 */
		 /* .param p1, "event" # Landroid/view/MotionEvent; */
		 /* .prologue */
		 /* .line 53 */
		 v0 = 		 (( android.view.MotionEvent ) p1 ).getActionIndex ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I
	 } // .end method
	 public Integer motionEventGetPointerCount ( android.view.MotionEvent p0 ) {
		 /* .locals 1 */
		 /* .param p1, "event" # Landroid/view/MotionEvent; */
		 /* .prologue */
		 /* .line 58 */
		 v0 = 		 (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
	 } // .end method
	 public Integer motionEventGetPointerId ( android.view.MotionEvent p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .param p1, "event" # Landroid/view/MotionEvent; */
		 /* .param p2, "pointerIndex" # I */
		 /* .prologue */
		 /* .line 63 */
		 v0 = 		 (( android.view.MotionEvent ) p1 ).getPointerId ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getPointerId(I)I
	 } // .end method
	 public Float motionEventGetX ( android.view.MotionEvent p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .param p1, "event" # Landroid/view/MotionEvent; */
		 /* .param p2, "pointerIndex" # I */
		 /* .prologue */
		 /* .line 68 */
		 v0 = 		 (( android.view.MotionEvent ) p1 ).getX ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F
	 } // .end method
	 public Float motionEventGetY ( android.view.MotionEvent p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .param p1, "event" # Landroid/view/MotionEvent; */
		 /* .param p2, "pointerIndex" # I */
		 /* .prologue */
		 /* .line 73 */
		 v0 = 		 (( android.view.MotionEvent ) p1 ).getY ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getY(I)F
	 } // .end method
	 public android.graphics.Typeface typefaceCreateFromFile ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 26 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 28 */
		 /* .local v1, "typeface":Landroid/graphics/Typeface; */
		 /* new-instance v0, Ljava/io/File; */
		 /* invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 /* .line 30 */
		 /* .local v0, "temp":Ljava/io/File; */
		 v2 = 		 (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 31 */
			 android.graphics.Typeface .createFromFile ( p1 );
			 /* .line 33 */
		 } // :cond_0
	 } // .end method
