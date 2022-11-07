public class org.haxe.HXCPP {
	 /* .source "HXCPP.java" */
	 /* # static fields */
	 static Boolean mInit;
	 /* # direct methods */
	 static org.haxe.HXCPP ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 6 */
		 int v0 = 0; // const/4 v0, 0x0
		 org.haxe.HXCPP.mInit = (v0!= 0);
		 return;
	 } // .end method
	 public org.haxe.HXCPP ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static native void main ( ) {
	 } // .end method
	 public static void run ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "inClassName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 9 */
		 java.lang.System .loadLibrary ( p0 );
		 /* .line 11 */
		 /* sget-boolean v0, Lorg/haxe/HXCPP;->mInit:Z */
		 /* if-nez v0, :cond_0 */
		 /* .line 13 */
		 int v0 = 1; // const/4 v0, 0x1
		 org.haxe.HXCPP.mInit = (v0!= 0);
		 /* .line 14 */
		 org.haxe.HXCPP .main ( );
		 /* .line 16 */
	 } // :cond_0
	 return;
} // .end method
