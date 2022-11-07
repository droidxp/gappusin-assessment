public class ao {
	 /* # instance fields */
	 Integer a;
	 Integer b;
	 java.lang.String c;
	 java.lang.String d;
	 android.app.Activity e;
	 private android.os.Handler f;
	 /* # direct methods */
	 public ao ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lap; */
		 /* invoke-direct {v0, p0}, Lap;-><init>(Lao;)V */
		 this.f = v0;
		 this.e = p1;
		 this.d = p2;
		 return;
	 } // .end method
	 public static java.lang.String a ( android.content.Context p0 ) {
		 /* .locals 5 */
		 final String v1 = ""; // const-string v1, ""
		 try { // :try_start_0
			 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
			 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 int v3 = 0; // const/4 v3, 0x0
			 (( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
			 v0 = this.versionName;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 try { // :try_start_1
					 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
					 /* :try_end_1 */
					 v1 = 					 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
					 /* if-gtz v1, :cond_1 */
				 } // :cond_0
				 final String v0 = ""; // const-string v0, ""
			 } // :cond_1
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* move-object v4, v0 */
		 /* move-object v0, v1 */
		 /* move-object v1, v4 */
	 } // :goto_1
	 final String v2 = "VersionInfo"; // const-string v2, "VersionInfo"
	 final String v3 = "Exception"; // const-string v3, "Exception"
	 android.util.Log .e ( v2,v3,v1 );
	 /* :catch_1 */
	 /* move-exception v1 */
} // .end method
public static Boolean a ( java.lang.String p0 ) {
	 /* .locals 2 */
	 int v0 = 0; // const/4 v0, 0x0
	 try { // :try_start_0
		 /* new-instance v1, Ljava/io/File; */
		 /* invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
		 /* :try_end_0 */
		 v1 = 		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_0
	 } // :goto_0
	 /* :catch_0 */
	 /* move-exception v1 */
} // .end method
/* # virtual methods */
void a ( Integer p0 ) {
	 /* .locals 2 */
	 /* new-instance v0, Landroid/os/Message; */
	 /* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
	 int v1 = 2; // const/4 v1, 0x2
	 /* iput v1, v0, Landroid/os/Message;->what:I */
	 v1 = this.f;
	 (( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
	 return;
} // .end method
