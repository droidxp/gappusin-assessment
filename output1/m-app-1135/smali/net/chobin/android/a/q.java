public class net.chobin.android.a.q {
	 /* # static fields */
	 private static android.content.Context a;
	 private static net.chobin.android.a.q a;
	 private static Boolean a;
	 /* # direct methods */
	 static net.chobin.android.a.q ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 int v0 = 0; // const/4 v0, 0x0
		 net.chobin.android.a.q.a = (v0!= 0);
		 return;
	 } // .end method
	 private net.chobin.android.a.q ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 v0 = 		 /* invoke-direct {p0}, Lnet/chobin/android/a/q;->a()Z */
		 net.chobin.android.a.q.a = (v0!= 0);
		 return;
	 } // .end method
	 public static void a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 v0 = net.chobin.android.a.q.a;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lnet/chobin/android/a/q; */
		 /* invoke-direct {v0, p0}, Lnet/chobin/android/a/q;-><init>(Landroid/content/Context;)V */
	 } // :cond_0
	 return;
} // .end method
public static void a ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* sget-boolean v0, Lnet/chobin/android/a/q;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 final String v0 = "chobin"; // const-string v0, "chobin"
		 android.util.Log .d ( v0,p0 );
	 } // :cond_0
	 return;
} // .end method
private Boolean a ( ) {
	 /* .locals 4 */
	 int v0 = 0; // const/4 v0, 0x0
	 v1 = net.chobin.android.a.q.a;
	 (( android.content.Context ) v1 ).getPackageManager ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 try { // :try_start_0
		 v2 = net.chobin.android.a.q.a;
		 (( android.content.Context ) v2 ).getPackageName ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 int v3 = 0; // const/4 v3, 0x0
		 (( android.content.pm.PackageManager ) v1 ).getApplicationInfo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
		 /* :try_end_0 */
		 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I */
		 /* and-int/lit8 v1, v1, 0x2 */
		 int v2 = 2; // const/4 v2, 0x2
		 /* if-ne v1, v2, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
} // :goto_0
/* :catch_0 */
/* move-exception v1 */
} // .end method
