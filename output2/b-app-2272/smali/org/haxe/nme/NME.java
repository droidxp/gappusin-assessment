public class org.haxe.nme.NME {
	 /* .source "NME.java" */
	 /* # static fields */
	 public static final Integer ACTIVATE;
	 public static final Integer DEACTIVATE;
	 public static final Integer DESTROY;
	 /* # direct methods */
	 static org.haxe.nme.NME ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 final String v0 = "nme"; // const-string v0, "nme"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 9 */
		 return;
	 } // .end method
	 public org.haxe.nme.NME ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static native Double callNumericFunction ( Long p0, java.lang.String p1, java.lang.Object[] p2 ) {
	 } // .end method
	 public static native java.lang.Object callObjectFunction ( Long p0, java.lang.String p1, java.lang.Object[] p2 ) {
	 } // .end method
	 public static native Double getNextWake ( ) {
	 } // .end method
	 public static native Integer onAccelerate ( Float p0, Float p1, Float p2 ) {
	 } // .end method
	 public static native Integer onActivity ( Integer p0 ) {
	 } // .end method
	 public static native void onCallback ( Long p0 ) {
	 } // .end method
	 public static native Integer onDeviceOrientationUpdate ( Integer p0 ) {
	 } // .end method
	 public static native Integer onKeyChange ( Integer p0, Boolean p1 ) {
	 } // .end method
	 public static native Integer onNormalOrientationFound ( Integer p0 ) {
	 } // .end method
	 public static native Integer onOrientationUpdate ( Float p0, Float p1, Float p2 ) {
	 } // .end method
	 public static native Integer onPoll ( ) {
	 } // .end method
	 public static native Integer onRender ( ) {
	 } // .end method
	 public static native Integer onResize ( Integer p0, Integer p1 ) {
	 } // .end method
	 public static native Integer onTouch ( Integer p0, Float p1, Float p2, Integer p3, Float p4, Float p5 ) {
	 } // .end method
	 public static native Integer onTrackball ( Float p0, Float p1 ) {
	 } // .end method
	 public static native void releaseReference ( Long p0 ) {
	 } // .end method
