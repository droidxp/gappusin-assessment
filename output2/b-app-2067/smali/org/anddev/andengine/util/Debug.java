public class org.anddev.andengine.util.Debug implements org.anddev.andengine.util.constants.Constants {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.Debug$DebugLevel sDebugLevel;
	 private static java.lang.String sDebugTag;
	 /* # direct methods */
	 static org.anddev.andengine.util.Debug ( ) {
		 /* .locals 1 */
		 final String v0 = "AndEngine"; // const-string v0, "AndEngine"
		 v0 = org.anddev.andengine.util.Debug$DebugLevel.VERBOSE;
		 return;
	 } // .end method
	 public org.anddev.andengine.util.Debug ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void d ( java.lang.String p0 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 org.anddev.andengine.util.Debug .d ( p0,v0 );
		 return;
	 } // .end method
	 public static void d ( java.lang.String p0, java.lang.Throwable p1 ) {
		 /* .locals 2 */
		 v0 = org.anddev.andengine.util.Debug.sDebugLevel;
		 v1 = org.anddev.andengine.util.Debug$DebugLevel.DEBUG;
		 v0 = 		 org.anddev.andengine.util.Debug$DebugLevel .access$2 ( v0,v1 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = org.anddev.andengine.util.Debug.sDebugTag;
			 android.util.Log .d ( v0,p0,p1 );
		 } // :cond_0
		 return;
	 } // .end method
	 public static void e ( java.lang.String p0 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 org.anddev.andengine.util.Debug .e ( p0,v0 );
		 return;
	 } // .end method
	 public static void e ( java.lang.String p0, java.lang.Throwable p1 ) {
		 /* .locals 2 */
		 v0 = org.anddev.andengine.util.Debug.sDebugLevel;
		 v1 = org.anddev.andengine.util.Debug$DebugLevel.ERROR;
		 v0 = 		 org.anddev.andengine.util.Debug$DebugLevel .access$2 ( v0,v1 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* if-nez p1, :cond_1 */
			 v0 = org.anddev.andengine.util.Debug.sDebugTag;
			 /* new-instance v1, Ljava/lang/Exception; */
			 /* invoke-direct {v1}, Ljava/lang/Exception;-><init>()V */
			 android.util.Log .e ( v0,p0,v1 );
		 } // :cond_0
	 } // :goto_0
	 return;
} // :cond_1
v0 = org.anddev.andengine.util.Debug.sDebugTag;
android.util.Log .e ( v0,p0,p1 );
} // .end method
public static void e ( java.lang.Throwable p0 ) {
/* .locals 1 */
v0 = org.anddev.andengine.util.Debug.sDebugTag;
org.anddev.andengine.util.Debug .e ( v0,p0 );
return;
} // .end method
public static org.anddev.andengine.util.Debug$DebugLevel getDebugLevel ( ) {
/* .locals 1 */
v0 = org.anddev.andengine.util.Debug.sDebugLevel;
} // .end method
public static java.lang.String getDebugTag ( ) {
/* .locals 1 */
v0 = org.anddev.andengine.util.Debug.sDebugTag;
} // .end method
public static void i ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.util.Debug .i ( p0,v0 );
return;
} // .end method
public static void i ( java.lang.String p0, java.lang.Throwable p1 ) {
/* .locals 2 */
v0 = org.anddev.andengine.util.Debug.sDebugLevel;
v1 = org.anddev.andengine.util.Debug$DebugLevel.INFO;
v0 = org.anddev.andengine.util.Debug$DebugLevel .access$2 ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = org.anddev.andengine.util.Debug.sDebugTag;
	 android.util.Log .i ( v0,p0,p1 );
} // :cond_0
return;
} // .end method
public static void setDebugLevel ( org.anddev.andengine.util.Debug$DebugLevel p0 ) {
/* .locals 2 */
/* if-nez p0, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "pDebugLevel must not be null!"; // const-string v1, "pDebugLevel must not be null!"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
return;
} // .end method
public static void setDebugTag ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public static void v ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.util.Debug .v ( p0,v0 );
return;
} // .end method
public static void v ( java.lang.String p0, java.lang.Throwable p1 ) {
/* .locals 2 */
v0 = org.anddev.andengine.util.Debug.sDebugLevel;
v1 = org.anddev.andengine.util.Debug$DebugLevel.VERBOSE;
v0 = org.anddev.andengine.util.Debug$DebugLevel .access$2 ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.anddev.andengine.util.Debug.sDebugTag;
android.util.Log .v ( v0,p0,p1 );
} // :cond_0
return;
} // .end method
public static void w ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.util.Debug .w ( p0,v0 );
return;
} // .end method
public static void w ( java.lang.String p0, java.lang.Throwable p1 ) {
/* .locals 2 */
v0 = org.anddev.andengine.util.Debug.sDebugLevel;
v1 = org.anddev.andengine.util.Debug$DebugLevel.WARNING;
v0 = org.anddev.andengine.util.Debug$DebugLevel .access$2 ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-nez p1, :cond_1 */
v0 = org.anddev.andengine.util.Debug.sDebugTag;
/* new-instance v1, Ljava/lang/Exception; */
/* invoke-direct {v1}, Ljava/lang/Exception;-><init>()V */
android.util.Log .w ( v0,p0,v1 );
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = org.anddev.andengine.util.Debug.sDebugTag;
android.util.Log .w ( v0,p0,p1 );
} // .end method
public static void w ( java.lang.Throwable p0 ) {
/* .locals 1 */
v0 = org.anddev.andengine.util.Debug.sDebugTag;
org.anddev.andengine.util.Debug .w ( v0,p0 );
return;
} // .end method
