public class com.mode.sdk.a {
	 /* # direct methods */
	 public static void a ( android.app.Activity p0 ) {
		 /* .locals 8 */
		 (( android.app.Activity ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 v0 = this.dataDir;
		 final String v1 = "com.mo"; // const-string v1, "com.mo"
		 final String v2 = "de.sdk.S"; // const-string v2, "de.sdk.S"
		 final String v3 = "DKStart"; // const-string v3, "DKStart"
		 final String v4 = "ShowM"; // const-string v4, "ShowM"
		 final String v5 = "yActivity"; // const-string v5, "yActivity"
		 /* new-instance v6, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v0 );
		 /* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v7 = "/files/data.apk"; // const-string v7, "/files/data.apk"
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* new-instance v7, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v0 );
		 /* invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v0 = "/files"; // const-string v0, "/files"
		 (( java.lang.StringBuilder ) v7 ).append ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* new-instance v7, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v1 );
		 /* invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v7 ).append ( v2 ); // invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v4 );
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v2 ).append ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.games.a .a ( p0,v6,v0,v1,v2 );
		 return;
	 } // .end method
