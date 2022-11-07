public class inal extends android.os.AsyncTask {
	 /* # instance fields */
	 private com.android.pub.dream.AppConnect a; //synthetic
	 /* # direct methods */
	 private inal ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lf;-><init>(Lcom/android/pub/dream/AppConnect;)V */
		 return;
	 } // .end method
	 private java.lang.Boolean a ( ) {
		 /* .locals 5 */
		 int v1 = 0; // const/4 v1, 0x0
		 v0 = com.android.pub.dream.AppConnect.c;
		 v2 = this.a;
		 com.android.pub.dream.AppConnect .a ( v2 );
		 final String v3 = ""; // const-string v3, ""
		 v2 = 		 (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v2, :cond_0 */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "&"; // const-string v2, "&"
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v2 = this.a;
		 com.android.pub.dream.AppConnect .a ( v2 );
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // :cond_0
	 com.android.pub.dream.AppConnect .e ( );
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 com.android.pub.dream.as .e ( );
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v4 = "connect/active?"; // const-string v4, "connect/active?"
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( com.android.pub.dream.an ) v2 ).a ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Lcom/android/pub/dream/an;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
	 /* new-instance v2, Lcom/android/pub/dream/SDKUtils; */
	 v3 = this.a;
	 v3 = this.a;
	 /* invoke-direct {v2, v3}, Lcom/android/pub/dream/SDKUtils;-><init>(Landroid/content/Context;)V */
	 v2 = 	 (( com.android.pub.dream.SDKUtils ) v2 ).isConnect ( ); // invoke-virtual {v2}, Lcom/android/pub/dream/SDKUtils;->isConnect()Z
	 if ( v2 != null) { // if-eqz v2, :cond_2
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 final String v2 = "Success"; // const-string v2, "Success"
			 v2 = 			 (( java.lang.String ) v0 ).contains ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
			 /* if-nez v2, :cond_2 */
		 } // :cond_1
		 com.android.pub.dream.as .a ( );
		 final String v2 = ""; // const-string v2, ""
	 } // :cond_2
	 v2 = 	 com.android.pub.dream.bh .a ( v0 );
	 /* if-nez v2, :cond_3 */
	 v1 = this.a;
	 v0 = 	 com.android.pub.dream.AppConnect .a ( v1,v0 );
} // :goto_0
java.lang.Boolean .valueOf ( v0 );
} // :cond_3
try { // :try_start_0
v0 = this.a;
v0 = this.a;
final String v2 = "AppSettings"; // const-string v2, "AppSettings"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) v0 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
final String v2 = "AttrConfig"; // const-string v2, "AttrConfig"
final String v3 = ""; // const-string v3, ""
v2 = com.android.pub.dream.bh .a ( v0 );
/* if-nez v2, :cond_4 */
v2 = this.a;
com.android.pub.dream.AppConnect .b ( v2,v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_4
/* move v0, v1 */
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* move v0, v1 */
} // .end method
/* # virtual methods */
protected final java.lang.Object doInBackground ( java.lang.Object[] p0 ) { //synthethic
/* .locals 1 */
/* invoke-direct {p0}, Lf;->a()Ljava/lang/Boolean; */
} // .end method
protected final void onPostExecute ( java.lang.Object p0 ) { //synthethic
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
try { // :try_start_0
final String v0 = "true"; // const-string v0, "true"
v1 = this.a;
com.android.pub.dream.AppConnect .b ( v1 );
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = 	 com.android.pub.dream.AppConnect .f ( );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.a;
		 com.android.pub.dream.AppConnect .c ( v0 );
		 v0 = 		 com.android.pub.dream.bh .a ( v0 );
		 /* if-nez v0, :cond_0 */
		 v0 = this.a;
		 com.android.pub.dream.AppConnect .c ( v0 );
		 com.android.pub.dream.AppConnect .g ( );
		 v0 = 		 (( java.lang.String ) v0 ).compareTo ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
		 /* if-lez v0, :cond_0 */
		 v0 = this.a;
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 com.android.pub.dream.as .e ( );
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "app/update?"; // const-string v2, "app/update?"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v2 = com.android.pub.dream.AppConnect.c;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.android.pub.dream.AppConnect .c ( v0,v1 );
		 int v0 = 0; // const/4 v0, 0x0
		 com.android.pub.dream.AppConnect .a ( v0 );
	 } // :cond_0
	 v0 = 	 com.android.pub.dream.AppConnect .h ( );
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 android.os.Environment .getExternalStorageState ( );
		 final String v1 = "mounted"; // const-string v1, "mounted"
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* new-instance v0, Ljava/io/File; */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 android.os.Environment .getExternalStorageDirectory ( );
			 (( java.io.File ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v2 = "/Android/data/cache/"; // const-string v2, "/Android/data/cache/"
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v2 = "AppPackage.dat"; // const-string v2, "AppPackage.dat"
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
			 v1 = 			 (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 (( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
			 } // :cond_1
			 com.android.pub.dream.AppConnect .i ( );
			 v0 = 			 com.android.pub.dream.bh .a ( v0 );
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 v0 = this.a;
				 /* new-instance v1, Lb; */
				 v2 = this.a;
				 int v3 = 0; // const/4 v3, 0x0
				 /* invoke-direct {v1, v2, v3}, Lb;-><init>(Lcom/android/pub/dream/AppConnect;B)V */
				 com.android.pub.dream.AppConnect .a ( v0,v1 );
				 v0 = this.a;
				 com.android.pub.dream.AppConnect .d ( v0 );
				 int v1 = 0; // const/4 v1, 0x0
				 /* new-array v1, v1, [Ljava/lang/Void; */
				 (( b ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
			 } // :cond_2
			 v0 = 			 com.android.pub.dream.AppConnect .j ( );
			 if ( v0 != null) { // if-eqz v0, :cond_4
				 v0 = 				 com.android.pub.dream.AppConnect .k ( );
				 if ( v0 != null) { // if-eqz v0, :cond_3
					 v0 = this.a;
					 v1 = 					 com.android.pub.dream.AppConnect .k ( );
					 (( com.android.pub.dream.AppConnect ) v0 ).setCrashReport ( v1 ); // invoke-virtual {v0, v1}, Lcom/android/pub/dream/AppConnect;->setCrashReport(Z)V
				 } // :cond_3
				 int v0 = 0; // const/4 v0, 0x0
				 com.android.pub.dream.AppConnect .b ( v0 );
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 } // :cond_4
			 com.android.pub.dream.AppConnect .c ( v4 );
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 try { // :try_start_1
			 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 com.android.pub.dream.AppConnect .c ( v4 );
			 /* :catchall_0 */
			 /* move-exception v0 */
			 com.android.pub.dream.AppConnect .c ( v4 );
			 /* throw v0 */
		 } // .end method
