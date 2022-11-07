public class com.umeng.common.net.m {
	 /* .source "NotificationUtils.java" */
	 /* # static fields */
	 public static final java.lang.String a;
	 public static final java.lang.String b;
	 public static final java.lang.String c;
	 public static final java.lang.String d;
	 public static final java.lang.String e;
	 /* # direct methods */
	 public com.umeng.common.net.m ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer a ( com.umeng.common.net.a$a p0 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 55 */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* long-to-int v0, v0 */
		 /* .line 56 */
		 /* if-gez v0, :cond_0 */
		 /* .line 57 */
		 /* neg-int v0, v0 */
		 /* .line 59 */
	 } // :cond_0
} // .end method
public static android.app.PendingIntent a ( android.content.Context p0, java.lang.String p1 ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 63 */
	 /* new-instance v0, Landroid/content/Intent; */
	 final String v1 = "com.umeng.intent.DOWNLOAD"; // const-string v1, "com.umeng.intent.DOWNLOAD"
	 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
	 /* .line 64 */
	 /* const/high16 v1, 0x40000000 # 2.0f */
	 (( android.content.Intent ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
	 /* .line 65 */
	 final String v1 = "com.umeng.broadcast.download.msg"; // const-string v1, "com.umeng.broadcast.download.msg"
	 (( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
	 /* .line 67 */
	 v1 = 	 (( java.lang.String ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/String;->hashCode()I
	 /* .line 68 */
	 /* const/high16 v2, 0x8000000 */
	 /* .line 66 */
	 android.app.PendingIntent .getBroadcast ( p0,v1,v0,v2 );
	 /* .line 69 */
} // .end method
public static java.lang.String a ( Integer p0, java.lang.String p1 ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 37 */
	 /* if-nez p0, :cond_0 */
	 /* .line 38 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 44 */
} // :goto_0
/* .line 40 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p0 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 41 */
final String v1 = ":"; // const-string v1, ":"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 42 */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 44 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static android.app.PendingIntent b ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 73 */
/* new-instance v0, Landroid/content/Intent; */
/* const-class v1, Lcom/umeng/common/net/DownloadingService; */
/* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 74 */
final String v1 = "com.umeng.broadcast.download.msg"; // const-string v1, "com.umeng.broadcast.download.msg"
(( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 76 */
v1 = (( java.lang.String ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/String;->hashCode()I
/* .line 77 */
/* const/high16 v2, 0x8000000 */
/* .line 75 */
android.app.PendingIntent .getService ( p0,v1,v0,v2 );
/* .line 78 */
} // .end method
