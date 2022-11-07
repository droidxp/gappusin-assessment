public class com.chartboost.sdk.CBUtility {
	 /* .source "CBUtility.java" */
	 /* # static fields */
	 private static java.lang.String ANDROID_AUID;
	 public static final Integer ANDROID_AUID_COOKIE_FLAG;
	 public static final java.lang.String ANDROID_AUID_COOKIE_KEY;
	 public static final java.lang.String ANDROID_AUID_COOKIE_PREFIX;
	 public static final java.lang.String AUID_STATIC_EMULATOR;
	 public static final java.lang.String AUID_STATIC_ERROR;
	 public static final java.lang.String PREFERENCES_FILE;
	 public static final java.lang.String PREFERENCES_SDCARD_PATH;
	 /* # direct methods */
	 static com.chartboost.sdk.CBUtility ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 58 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 18 */
		 return;
	 } // .end method
	 public com.chartboost.sdk.CBUtility ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String getAUID ( android.content.Context p0 ) {
		 /* .locals 14 */
		 /* .param p0, "ctx" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 70 */
		 v11 = com.chartboost.sdk.CBUtility.ANDROID_AUID;
		 if ( v11 != null) { // if-eqz v11, :cond_0
			 /* .line 71 */
			 v1 = com.chartboost.sdk.CBUtility.ANDROID_AUID;
			 /* .line 218 */
		 } // :goto_0
		 /* .line 74 */
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 75 */
	 /* .local v1, "cookie":Ljava/lang/String; */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 76 */
	 /* .local v3, "cookiePath":Ljava/io/File; */
	 int v5 = 1; // const/4 v5, 0x1
	 /* .line 79 */
	 /* .local v5, "doBackup":Z */
	 final String v11 = "ChartBoost.cb"; // const-string v11, "ChartBoost.cb"
	 /* .line 80 */
	 int v12 = 1; // const/4 v12, 0x1
	 /* .line 79 */
	 (( android.content.Context ) p0 ).getSharedPreferences ( v11, v12 ); // invoke-virtual {p0, v11, v12}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 /* .line 82 */
	 /* .local v9, "preferences":Landroid/content/SharedPreferences; */
	 final String v11 = "cb_auid"; // const-string v11, "cb_auid"
	 int v12 = 0; // const/4 v12, 0x0
	 /* .line 83 */
	 /* .local v10, "value":Ljava/lang/String; */
	 if ( v10 != null) { // if-eqz v10, :cond_1
		 /* .line 87 */
		 /* move-object v1, v10 */
		 /* .line 92 */
	 } // :cond_1
	 /* new-instance v11, Ljava/lang/StringBuilder; */
	 android.os.Environment .getExternalStorageDirectory ( );
	 (( java.io.File ) v12 ).getAbsolutePath ( ); // invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
	 java.lang.String .valueOf ( v12 );
	 /* invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* .line 93 */
	 final String v12 = "/Android/data/com.chartboost.sdk/files"; // const-string v12, "/Android/data/com.chartboost.sdk/files"
	 (( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v12 = "/"; // const-string v12, "/"
	 (( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v12 = "ChartBoost.cb"; // const-string v12, "ChartBoost.cb"
	 (( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 92 */
	 (( java.lang.StringBuilder ) v11 ).toString ( ); // invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 95 */
	 /* .local v4, "cookieUri":Ljava/lang/String; */
	 /* new-instance v3, Ljava/io/File; */
} // .end local v3 # "cookiePath":Ljava/io/File;
/* invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 98 */
/* .restart local v3 # "cookiePath":Ljava/io/File; */
/* if-nez v1, :cond_2 */
/* .line 102 */
try { // :try_start_0
	 android.os.Environment .getExternalStorageState ( );
	 final String v12 = "mounted"; // const-string v12, "mounted"
	 v11 = 	 (( java.lang.String ) v11 ).equals ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v11 != null) { // if-eqz v11, :cond_2
		 /* .line 106 */
		 v11 = 		 (( java.io.File ) v3 ).isFile ( ); // invoke-virtual {v3}, Ljava/io/File;->isFile()Z
		 if ( v11 != null) { // if-eqz v11, :cond_2
			 /* .line 110 */
			 /* new-instance v2, Ljava/lang/StringBuffer; */
			 final String v11 = ""; // const-string v11, ""
			 /* invoke-direct {v2, v11}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
			 /* .line 111 */
			 /* .local v2, "cookieContent":Ljava/lang/StringBuffer; */
			 /* new-instance v7, Ljava/io/FileInputStream; */
			 /* invoke-direct {v7, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
			 /* .line 114 */
			 /* .local v7, "fis":Ljava/io/FileInputStream; */
		 } // :goto_1
		 v0 = 		 (( java.io.FileInputStream ) v7 ).read ( ); // invoke-virtual {v7}, Ljava/io/FileInputStream;->read()I
		 /* .local v0, "c":I */
		 int v11 = -1; // const/4 v11, -0x1
		 /* if-ne v0, v11, :cond_3 */
		 /* .line 118 */
		 (( java.io.FileInputStream ) v7 ).close ( ); // invoke-virtual {v7}, Ljava/io/FileInputStream;->close()V
		 /* .line 124 */
		 v11 = 		 (( java.lang.StringBuffer ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I
		 /* const/16 v12, 0x28 */
		 /* if-ne v11, v12, :cond_2 */
		 /* .line 125 */
		 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 127 */
		 int v5 = 0; // const/4 v5, 0x0
		 /* .line 148 */
	 } // .end local v0 # "c":I
} // .end local v2 # "cookieContent":Ljava/lang/StringBuffer;
} // .end local v7 # "fis":Ljava/io/FileInputStream;
} // :cond_2
} // :goto_2
/* if-nez v1, :cond_5 */
/* .line 153 */
java.util.UUID .randomUUID ( );
/* .line 155 */
/* .local v8, "myUUID":Ljava/util/UUID; */
/* if-nez v8, :cond_4 */
/* .line 158 */
final String v1 = "unknown"; // const-string v1, "unknown"
/* .line 160 */
/* goto/16 :goto_0 */
/* .line 115 */
} // .end local v8 # "myUUID":Ljava/util/UUID;
/* .restart local v0 # "c":I */
/* .restart local v2 # "cookieContent":Ljava/lang/StringBuffer; */
/* .restart local v7 # "fis":Ljava/io/FileInputStream; */
} // :cond_3
/* int-to-char v11, v0 */
try { // :try_start_1
(( java.lang.StringBuffer ) v2 ).append ( v11 ); // invoke-virtual {v2, v11}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 141 */
} // .end local v0 # "c":I
} // .end local v2 # "cookieContent":Ljava/lang/StringBuffer;
} // .end local v7 # "fis":Ljava/io/FileInputStream;
/* :catch_0 */
/* move-exception v11 */
/* .line 162 */
/* .restart local v8 # "myUUID":Ljava/util/UUID; */
} // :cond_4
(( java.util.UUID ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/util/UUID;->toString()Ljava/lang/String;
/* .line 166 */
/* new-instance v11, Ljava/lang/StringBuilder; */
final String v12 = "android-"; // const-string v12, "android-"
/* invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v12 = "-"; // const-string v12, "-"
final String v13 = ""; // const-string v13, ""
(( java.lang.String ) v1 ).replace ( v12, v13 ); // invoke-virtual {v1, v12, v13}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
(( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v11 ).toString ( ); // invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 175 */
} // .end local v8 # "myUUID":Ljava/util/UUID;
} // :cond_5
v11 = final String v12 = "cb_auid"; // const-string v12, "cb_auid"
if ( v11 != null) { // if-eqz v11, :cond_7
/* .line 187 */
if ( v5 != null) { // if-eqz v5, :cond_6
/* .line 190 */
try { // :try_start_2
v11 = (( java.io.File ) v3 ).exists ( ); // invoke-virtual {v3}, Ljava/io/File;->exists()Z
if ( v11 != null) { // if-eqz v11, :cond_8
/* .line 191 */
(( java.io.File ) v3 ).delete ( ); // invoke-virtual {v3}, Ljava/io/File;->delete()Z
/* .line 196 */
} // :goto_3
v11 = (( java.io.File ) v3 ).createNewFile ( ); // invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
if ( v11 != null) { // if-eqz v11, :cond_6
/* .line 197 */
/* new-instance v6, Ljava/io/FileWriter; */
int v11 = 0; // const/4 v11, 0x0
/* invoke-direct {v6, v3, v11}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V */
/* .line 198 */
/* .local v6, "filewriter":Ljava/io/FileWriter; */
(( java.io.FileWriter ) v6 ).write ( v1 ); // invoke-virtual {v6, v1}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V
/* .line 199 */
(( java.io.FileWriter ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/FileWriter;->close()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 216 */
} // .end local v6 # "filewriter":Ljava/io/FileWriter;
} // :cond_6
} // :goto_4
/* goto/16 :goto_0 */
/* .line 181 */
} // :cond_7
final String v1 = "unknown"; // const-string v1, "unknown"
/* .line 183 */
/* goto/16 :goto_0 */
/* .line 193 */
} // :cond_8
try { // :try_start_3
(( java.io.File ) v3 ).mkdirs ( ); // invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .line 207 */
/* :catch_1 */
/* move-exception v11 */
} // .end method
