public class com.mxj.fun.Telspded {
	 /* .source "Telspded.java" */
	 /* # static fields */
	 public static final java.lang.String TAG;
	 /* # instance fields */
	 private android.content.Context context;
	 private com.mxj.stl.Ubas user;
	 /* # direct methods */
	 static com.mxj.fun.Telspded ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 18 */
		 /* const-class v0, Lcom/mxj/fun/Telspded; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public com.mxj.fun.Telspded ( ) {
		 /* .locals 1 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 19 */
		 /* new-instance v0, Lcom/mxj/stl/Ubas; */
		 /* invoke-direct {v0}, Lcom/mxj/stl/Ubas;-><init>()V */
		 this.user = v0;
		 /* .line 24 */
		 this.context = p1;
		 /* .line 26 */
		 try { // :try_start_0
			 /* invoke-direct {p0}, Lcom/mxj/fun/Telspded;->initTelephony()V */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 31 */
		 } // :goto_0
		 return;
		 /* .line 27 */
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
	 private void initTelephony ( ) {
		 /* .locals 21 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/content/pm/PackageManager$NameNotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 35 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.context;
	 /* move-object/from16 v18, v0 */
	 final String v19 = "phone"; // const-string v19, "phone"
	 /* invoke-virtual/range {v18 ..v19}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object; */
	 /* check-cast v13, Landroid/telephony/TelephonyManager; */
	 /* .line 37 */
	 /* .local v13, "tm":Landroid/telephony/TelephonyManager; */
	 if ( v13 != null) { // if-eqz v13, :cond_3
		 /* .line 40 */
		 (( android.telephony.TelephonyManager ) v13 ).getDeviceId ( ); // invoke-virtual {v13}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
		 /* .line 41 */
		 /* .local v4, "imei":Ljava/lang/String; */
		 v18 = com.mxj.fun.Telspded.TAG;
		 /* new-instance v19, Ljava/lang/StringBuilder; */
		 final String v20 = "IMEI:"; // const-string v20, "IMEI:"
		 /* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* move-object/from16 v0, v19 */
		 (( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
		 /* invoke-static/range {v18 ..v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I */
		 /* .line 44 */
		 (( android.telephony.TelephonyManager ) v13 ).getSimOperator ( ); // invoke-virtual {v13}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;
		 /* .line 45 */
		 /* .local v5, "imsi":Ljava/lang/String; */
		 if ( v5 != null) { // if-eqz v5, :cond_0
			 (( java.lang.String ) v5 ).trim ( ); // invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
			 v18 = 			 /* invoke-virtual/range {v18 ..v18}, Ljava/lang/String;->length()I */
			 /* if-gtz v18, :cond_1 */
			 /* .line 48 */
		 } // :cond_0
		 /* new-instance v18, Ljava/lang/StringBuilder; */
		 (( android.telephony.TelephonyManager ) v13 ).getNetworkOperator ( ); // invoke-virtual {v13}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;
		 /* invoke-static/range {v19 ..v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String; */
		 /* invoke-direct/range {v18 ..v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v19 = "00000000"; // const-string v19, "00000000"
		 /* invoke-virtual/range {v18 ..v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
		 /* invoke-virtual/range {v18 ..v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
		 /* .line 50 */
	 } // :cond_1
	 /* move-object/from16 v0, p0 */
	 v0 = this.context;
	 /* move-object/from16 v18, v0 */
	 /* invoke-virtual/range {v18 ..v18}, Landroid/content/Context;->getPackageName()Ljava/lang/String; */
	 /* .line 51 */
	 /* .local v8, "packageName":Ljava/lang/String; */
	 /* move-object/from16 v0, p0 */
	 v0 = this.context;
	 /* move-object/from16 v18, v0 */
	 /* invoke-virtual/range {v18 ..v18}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager; */
	 /* .line 52 */
	 /* .local v7, "packageManager":Landroid/content/pm/PackageManager; */
	 /* const/16 v18, 0x0 */
	 /* move/from16 v0, v18 */
	 (( android.content.pm.PackageManager ) v7 ).getPackageInfo ( v8, v0 ); // invoke-virtual {v7, v8, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
	 /* .line 53 */
	 /* .local v6, "packageInfo":Landroid/content/pm/PackageInfo; */
	 v0 = this.versionName;
	 /* move-object/from16 v17, v0 */
	 /* .line 54 */
	 /* .local v17, "versionName":Ljava/lang/String; */
	 /* iget v0, v6, Landroid/content/pm/PackageInfo;->versionCode:I */
	 /* move/from16 v16, v0 */
	 /* .line 57 */
	 /* .local v16, "versionCode":I */
	 int v15 = -1; // const/4 v15, -0x1
	 /* .line 58 */
	 /* .local v15, "uid":I */
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v10 */
	 /* .line 61 */
	 /* .local v10, "regTime":J */
	 try { // :try_start_0
		 v18 = com.mxj.fun.Lsiens.usFile;
		 if ( v18 != null) { // if-eqz v18, :cond_2
			 v18 = com.mxj.fun.Lsiens.usFile;
			 v18 = 			 /* invoke-virtual/range {v18 ..v18}, Ljava/io/File;->exists()Z */
			 if ( v18 != null) { // if-eqz v18, :cond_2
				 /* .line 62 */
				 v18 = com.mxj.fun.Lsiens.usFile;
				 final String v19 = "utf-8"; // const-string v19, "utf-8"
				 /* invoke-static/range {v18 ..v19}, Lcom/mxj/tolas/Tools;->readFileContent(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String; */
				 /* .line 63 */
				 /* .local v3, "content":Ljava/lang/String; */
				 if ( v3 != null) { // if-eqz v3, :cond_2
					 /* .line 64 */
					 final String v18 = "\n"; // const-string v18, "\n"
					 final String v19 = ""; // const-string v19, ""
					 /* move-object/from16 v0, v18 */
					 /* move-object/from16 v1, v19 */
					 (( java.lang.String ) v3 ).replace ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
					 /* .line 65 */
					 final String v18 = "\r"; // const-string v18, "\r"
					 final String v19 = ""; // const-string v19, ""
					 /* move-object/from16 v0, v18 */
					 /* move-object/from16 v1, v19 */
					 (( java.lang.String ) v3 ).replace ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
					 /* .line 66 */
					 (( java.lang.String ) v3 ).trim ( ); // invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
					 /* .line 67 */
					 final String v18 = ","; // const-string v18, ","
					 /* move-object/from16 v0, v18 */
					 (( java.lang.String ) v3 ).split ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
					 /* .line 68 */
					 /* .local v12, "strings":[Ljava/lang/String; */
					 /* array-length v0, v12 */
					 /* move/from16 v18, v0 */
					 /* const/16 v19, 0x2 */
					 /* move/from16 v0, v18 */
					 /* move/from16 v1, v19 */
					 /* if-ne v0, v1, :cond_2 */
					 /* .line 69 */
					 /* const/16 v18, 0x0 */
					 /* aget-object v18, v12, v18 */
					 v15 = 					 /* invoke-static/range {v18 ..v18}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I */
					 /* .line 70 */
					 /* const/16 v18, 0x1 */
					 /* aget-object v18, v12, v18 */
					 /* invoke-static/range {v18 ..v18}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J */
					 /* :try_end_0 */
					 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* move-result-wide v10 */
					 /* .line 79 */
				 } // .end local v3 # "content":Ljava/lang/String;
			 } // .end local v12 # "strings":[Ljava/lang/String;
		 } // :cond_2
	 } // :goto_0
	 /* move-object/from16 v0, p0 */
	 v0 = this.context;
	 /* move-object/from16 v18, v0 */
	 /* invoke-virtual/range {v18 ..v18}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager; */
	 /* .line 80 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.context;
	 /* move-object/from16 v19, v0 */
	 /* invoke-virtual/range {v19 ..v19}, Landroid/content/Context;->getPackageName()Ljava/lang/String; */
	 /* .line 81 */
	 /* const/16 v20, 0x80 */
	 /* .line 80 */
	 /* invoke-virtual/range {v18 ..v20}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo; */
	 /* .line 82 */
	 /* .local v2, "appInfo":Landroid/content/pm/ApplicationInfo; */
	 v0 = this.metaData;
	 /* move-object/from16 v18, v0 */
	 final String v19 = "lis_pv"; // const-string v19, "lis_pv"
	 v9 = 	 /* invoke-virtual/range {v18 ..v19}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I */
	 /* .line 84 */
	 /* .local v9, "pluVer":I */
	 /* move-object/from16 v0, p0 */
	 v0 = this.user;
	 /* move-object/from16 v18, v0 */
	 /* new-instance v19, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( v9 );
	 /* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
	 /* invoke-virtual/range {v18 ..v19}, Lcom/mxj/stl/Ubas;->setPlsdCode(Ljava/lang/String;)V */
	 /* .line 85 */
	 v14 = android.os.Build.MODEL;
	 /* .line 86 */
	 /* .local v14, "ua":Ljava/lang/String; */
	 /* move-object/from16 v0, p0 */
	 v0 = this.user;
	 /* move-object/from16 v18, v0 */
	 /* move-object/from16 v0, v18 */
	 (( com.mxj.stl.Ubas ) v0 ).setUsk ( v14 ); // invoke-virtual {v0, v14}, Lcom/mxj/stl/Ubas;->setUsk(Ljava/lang/String;)V
	 /* .line 88 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.user;
	 /* move-object/from16 v18, v0 */
	 /* move-object/from16 v0, v18 */
	 (( com.mxj.stl.Ubas ) v0 ).setUsdid ( v15 ); // invoke-virtual {v0, v15}, Lcom/mxj/stl/Ubas;->setUsdid(I)V
	 /* .line 89 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.user;
	 /* move-object/from16 v18, v0 */
	 /* move-object/from16 v0, v18 */
	 (( com.mxj.stl.Ubas ) v0 ).setPassme ( v8 ); // invoke-virtual {v0, v8}, Lcom/mxj/stl/Ubas;->setPassme(Ljava/lang/String;)V
	 /* .line 90 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.user;
	 /* move-object/from16 v18, v0 */
	 /* move-object/from16 v0, v18 */
	 (( com.mxj.stl.Ubas ) v0 ).setRegsgsTsime ( v10, v11 ); // invoke-virtual {v0, v10, v11}, Lcom/mxj/stl/Ubas;->setRegsgsTsime(J)V
	 /* .line 91 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.user;
	 /* move-object/from16 v18, v0 */
	 /* new-instance v19, Ljava/lang/StringBuilder; */
	 /* invoke-static/range {v16 ..v16}, Ljava/lang/String;->valueOf(I)Ljava/lang/String; */
	 /* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
	 /* invoke-virtual/range {v18 ..v19}, Lcom/mxj/stl/Ubas;->setVersise(Ljava/lang/String;)V */
	 /* .line 92 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.user;
	 /* move-object/from16 v18, v0 */
	 /* move-object/from16 v0, v18 */
	 /* move-object/from16 v1, v17 */
	 (( com.mxj.stl.Ubas ) v0 ).setVersidse ( v1 ); // invoke-virtual {v0, v1}, Lcom/mxj/stl/Ubas;->setVersidse(Ljava/lang/String;)V
	 /* .line 93 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.user;
	 /* move-object/from16 v18, v0 */
	 /* new-instance v19, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( v4 );
	 /* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 v20 = com.mxj.stl.Ubas.split;
	 /* invoke-virtual/range {v19 ..v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
	 /* move-object/from16 v0, v19 */
	 (( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
	 /* invoke-virtual/range {v18 ..v19}, Lcom/mxj/stl/Ubas;->setImhjrdmsi(Ljava/lang/String;)V */
	 /* .line 94 */
	 v18 = com.mxj.fun.Telspded.TAG;
	 /* new-instance v19, Ljava/lang/StringBuilder; */
	 final String v20 = "IMSI:"; // const-string v20, "IMSI:"
	 /* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* move-object/from16 v0, v19 */
	 (( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
	 /* invoke-static/range {v18 ..v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I */
	 /* .line 95 */
	 v18 = com.mxj.fun.Telspded.TAG;
	 /* new-instance v19, Ljava/lang/StringBuilder; */
	 final String v20 = "imei+User.split+imsi:"; // const-string v20, "imei+User.split+imsi:"
	 /* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* move-object/from16 v0, v19 */
	 (( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v20 = com.mxj.stl.Ubas.split;
	 /* invoke-virtual/range {v19 ..v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
	 /* move-object/from16 v0, v19 */
	 (( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
	 /* invoke-static/range {v18 ..v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I */
	 /* .line 96 */
	 v18 = com.mxj.fun.Telspded.TAG;
	 /* new-instance v19, Ljava/lang/StringBuilder; */
	 final String v20 = "packageName:"; // const-string v20, "packageName:"
	 /* invoke-direct/range {v19 ..v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* move-object/from16 v0, v19 */
	 (( java.lang.StringBuilder ) v0 ).append ( v8 ); // invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* invoke-virtual/range {v19 ..v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
	 /* invoke-static/range {v18 ..v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I */
	 /* .line 98 */
} // .end local v2 # "appInfo":Landroid/content/pm/ApplicationInfo;
} // .end local v4 # "imei":Ljava/lang/String;
} // .end local v5 # "imsi":Ljava/lang/String;
} // .end local v6 # "packageInfo":Landroid/content/pm/PackageInfo;
} // .end local v7 # "packageManager":Landroid/content/pm/PackageManager;
} // .end local v8 # "packageName":Ljava/lang/String;
} // .end local v9 # "pluVer":I
} // .end local v10 # "regTime":J
} // .end local v14 # "ua":Ljava/lang/String;
} // .end local v15 # "uid":I
} // .end local v16 # "versionCode":I
} // .end local v17 # "versionName":Ljava/lang/String;
} // :cond_3
return;
/* .line 75 */
/* .restart local v4 # "imei":Ljava/lang/String; */
/* .restart local v5 # "imsi":Ljava/lang/String; */
/* .restart local v6 # "packageInfo":Landroid/content/pm/PackageInfo; */
/* .restart local v7 # "packageManager":Landroid/content/pm/PackageManager; */
/* .restart local v8 # "packageName":Ljava/lang/String; */
/* .restart local v10 # "regTime":J */
/* .restart local v15 # "uid":I */
/* .restart local v16 # "versionCode":I */
/* .restart local v17 # "versionName":Ljava/lang/String; */
/* :catch_0 */
/* move-exception v18 */
/* goto/16 :goto_0 */
} // .end method
/* # virtual methods */
public com.mxj.stl.Ubas getUser ( ) {
/* .locals 1 */
/* .prologue */
/* .line 101 */
v0 = this.user;
} // .end method
public void setUser ( com.mxj.stl.Ubas p0 ) {
/* .locals 0 */
/* .param p1, "user" # Lcom/mxj/stl/Ubas; */
/* .prologue */
/* .line 105 */
this.user = p1;
/* .line 106 */
return;
} // .end method
