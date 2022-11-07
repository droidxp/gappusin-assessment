public class com.wiyun.engine.lua.Lua {
	 /* .source "Lua.java" */
	 /* # direct methods */
	 public com.wiyun.engine.lua.Lua ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static native void destroy ( ) {
	 } // .end method
	 public static native void execute ( Integer p0 ) {
	 } // .end method
	 public static native void execute ( java.lang.String p0 ) {
	 } // .end method
	 public static native void execute ( java.lang.String p0, Boolean p1 ) {
	 } // .end method
	 public static Float getGlobalFloat ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 137 */
		 int v0 = 0; // const/4 v0, 0x0
		 v0 = 		 com.wiyun.engine.lua.Lua .getGlobalFloat ( p0,v0 );
	 } // .end method
	 public static native Float getGlobalFloat ( java.lang.String p0, Float p1 ) {
	 } // .end method
	 public static Integer getGlobalInt ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 118 */
		 int v0 = -1; // const/4 v0, -0x1
		 v0 = 		 com.wiyun.engine.lua.Lua .getGlobalInt ( p0,v0 );
	 } // .end method
	 public static native Integer getGlobalInt ( java.lang.String p0, Integer p1 ) {
	 } // .end method
	 public static native Integer getGlobalObject ( java.lang.String p0 ) {
	 } // .end method
	 public static native java.lang.String getGlobalString ( java.lang.String p0 ) {
	 } // .end method
	 public static native void init ( ) {
	 } // .end method
	 public static native void setGlobal ( java.lang.String p0, Float p1 ) {
	 } // .end method
	 public static native void setGlobal ( java.lang.String p0, Integer p1 ) {
	 } // .end method
	 public static void setGlobal ( java.lang.String p0, java.lang.Object p1 ) {
		 /* .locals 1 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .param p1, "obj" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 67 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.wiyun.engine.lua.Lua .setGlobal ( p0,p1,v0 );
		 /* .line 68 */
		 return;
	 } // .end method
	 public static native void setGlobal ( java.lang.String p0, java.lang.Object p1, java.lang.String p2 ) {
	 } // .end method
	 public static native void setGlobal ( java.lang.String p0, java.lang.String p1 ) {
	 } // .end method
