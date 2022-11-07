public class com.umeng.common.util.DeltaUpdate {
	 /* .source "DeltaUpdate.java" */
	 /* # static fields */
	 private static Boolean a;
	 private static final java.lang.String b;
	 /* # direct methods */
	 static com.umeng.common.util.DeltaUpdate ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 49 */
		 try { // :try_start_0
			 final String v0 = "bspatch"; // const-string v0, "bspatch"
			 java.lang.System .loadLibrary ( v0 );
			 /* .line 50 */
			 int v0 = 1; // const/4 v0, 0x1
			 com.umeng.common.util.DeltaUpdate.a = (v0!= 0);
			 /* :try_end_0 */
			 /* .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 54 */
		 } // :goto_0
		 return;
		 /* .line 51 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 52 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.umeng.common.util.DeltaUpdate.a = (v0!= 0);
	 } // .end method
	 public com.umeng.common.util.DeltaUpdate ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 28 */
		 v0 = 		 com.umeng.common.util.DeltaUpdate .bspatch ( p0,p1,p2 );
	 } // .end method
	 public static java.lang.String a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 32 */
		 (( android.content.Context ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 v0 = this.sourceDir;
	 } // .end method
	 public static Boolean a ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 17 */
		 /* sget-boolean v0, Lcom/umeng/common/util/DeltaUpdate;->a:Z */
	 } // .end method
	 public static java.lang.String b ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 37 */
		 com.umeng.common.util.DeltaUpdate .a ( p0 );
		 /* .line 38 */
		 /* new-instance v1, Ljava/io/File; */
		 /* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 /* .line 39 */
		 v1 = 		 (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
		 /* if-nez v1, :cond_0 */
		 /* .line 40 */
		 final String v0 = ""; // const-string v0, ""
		 /* .line 42 */
	 } // :goto_0
} // :cond_0
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
com.umeng.common.util.h .a ( v1 );
} // .end method
public static native Integer bspatch ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
} // .end method
