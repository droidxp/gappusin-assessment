public class com.flurry.android.Flog {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer ASSERT;
	 public static final Integer DEBUG;
	 public static final Integer ERROR;
	 public static final Integer INFO;
	 public static final Integer VERBOSE;
	 public static final Integer WARN;
	 private static Boolean a;
	 /* # direct methods */
	 static com.flurry.android.Flog ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.flurry.android.Flog.a = (v0!= 0);
		 /* .line 9 */
		 return;
	 } // .end method
	 public com.flurry.android.Flog ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 7 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static Integer a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 30 */
		 /* sget-boolean v0, Lcom/flurry/android/Flog;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 31 */
		 } // :goto_0
	 } // :cond_0
	 v0 = 	 android.util.Log .d ( p0,p1 );
} // .end method
static Integer a ( java.lang.String p0, java.lang.String p1, java.lang.Throwable p2 ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 26 */
	 /* sget-boolean v0, Lcom/flurry/android/Flog;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 27 */
	 } // :goto_0
} // :cond_0
v0 = android.util.Log .d ( p0,p1,p2 );
} // .end method
static Boolean a ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 23 */
int v0 = 3; // const/4 v0, 0x3
v0 = android.util.Log .isLoggable ( p0,v0 );
} // .end method
static Integer b ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 38 */
/* sget-boolean v0, Lcom/flurry/android/Flog;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 39 */
} // :goto_0
} // :cond_0
v0 = android.util.Log .e ( p0,p1 );
} // .end method
static Integer b ( java.lang.String p0, java.lang.String p1, java.lang.Throwable p2 ) {
/* .locals 1 */
/* .prologue */
/* .line 34 */
/* sget-boolean v0, Lcom/flurry/android/Flog;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 35 */
} // :goto_0
} // :cond_0
v0 = android.util.Log .e ( p0,p1,p2 );
} // .end method
static Integer c ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 62 */
/* sget-boolean v0, Lcom/flurry/android/Flog;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 63 */
} // :goto_0
} // :cond_0
v0 = android.util.Log .w ( p0,p1 );
} // .end method
public static void disableLog ( ) {
/* .locals 1 */
/* .prologue */
/* .line 19 */
int v0 = 1; // const/4 v0, 0x1
com.flurry.android.Flog.a = (v0!= 0);
return;
} // .end method
public static void enableLog ( ) {
/* .locals 1 */
/* .prologue */
/* .line 21 */
int v0 = 0; // const/4 v0, 0x0
com.flurry.android.Flog.a = (v0!= 0);
return;
} // .end method
