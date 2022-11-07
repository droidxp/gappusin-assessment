public class inal {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0, Object[] p1, android.content.Context p2 ) {
		 /* .locals 2 */
		 final String v0 = "xuming"; // const-string v0, "xuming"
		 final String v1 = "in"; // const-string v1, "in"
		 android.util.Log .w ( v0,v1 );
		 int v0 = 0; // const/4 v0, 0x0
		 (( android.content.Context ) p2 ).openFileOutput ( p0, v0 ); // invoke-virtual {p2, p0, v0}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
		 (( java.io.FileOutputStream ) v0 ).write ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/FileOutputStream;->write([B)V
		 (( java.io.FileOutputStream ) v0 ).flush ( ); // invoke-virtual {v0}, Ljava/io/FileOutputStream;->flush()V
		 (( java.io.FileOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
		 return;
	 } // .end method
	 public static a ( java.lang.String p0, android.content.Context p1 ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 try { // :try_start_0
			 (( android.content.Context ) p1 ).openFileInput ( p0 ); // invoke-virtual {p1, p0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
			 v1 = 			 (( java.io.FileInputStream ) v0 ).available ( ); // invoke-virtual {v0}, Ljava/io/FileInputStream;->available()I
			 /* new-array v1, v1, [B */
			 (( java.io.FileInputStream ) v0 ).read ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/FileInputStream;->read([B)I
			 (( java.io.FileInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
			 /* array-length v0, v1 */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* if-nez v0, :cond_0 */
			 /* move-object v0, v2 */
		 } // :goto_0
	 } // :cond_0
	 /* move-object v0, v1 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 /* move-object v0, v2 */
} // .end method
