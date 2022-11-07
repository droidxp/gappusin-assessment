class com.umeng.common.net.a$a {
	 /* .source "DownloadAgent.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/common/net/a; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public java.lang.String a;
public java.lang.String b;
public java.lang.String c;
public java.lang.String d;
public java.lang.String e;
public java.lang.String f;
public Boolean g;
/* # direct methods */
public com.umeng.common.net.a$a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 213 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 206 */
int v0 = 0; // const/4 v0, 0x0
this.f = v0;
/* .line 211 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/umeng/common/net/a$a;->g:Z */
/* .line 214 */
this.a = p1;
/* .line 215 */
this.b = p2;
/* .line 216 */
this.c = p3;
/* .line 217 */
return;
} // .end method
public static com.umeng.common.net.a$a a ( android.os.Bundle p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 232 */
final String v0 = "mComponentName"; // const-string v0, "mComponentName"
(( android.os.Bundle ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 233 */
final String v1 = "mTitle"; // const-string v1, "mTitle"
(( android.os.Bundle ) p0 ).getString ( v1 ); // invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 234 */
final String v2 = "mUrl"; // const-string v2, "mUrl"
(( android.os.Bundle ) p0 ).getString ( v2 ); // invoke-virtual {p0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 235 */
/* new-instance v3, Lcom/umeng/common/net/a$a; */
/* invoke-direct {v3, v0, v1, v2}, Lcom/umeng/common/net/a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 236 */
final String v0 = "mMd5"; // const-string v0, "mMd5"
(( android.os.Bundle ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
this.d = v0;
/* .line 237 */
final String v0 = "mTargetMd5"; // const-string v0, "mTargetMd5"
(( android.os.Bundle ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
this.e = v0;
/* .line 238 */
final String v0 = "reporturls"; // const-string v0, "reporturls"
(( android.os.Bundle ) p0 ).getStringArray ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;
this.f = v0;
/* .line 239 */
final String v0 = "rich_notification"; // const-string v0, "rich_notification"
v0 = (( android.os.Bundle ) p0 ).getBoolean ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
/* iput-boolean v0, v3, Lcom/umeng/common/net/a$a;->g:Z */
/* .line 240 */
} // .end method
/* # virtual methods */
public android.os.Bundle a ( ) {
/* .locals 3 */
/* .prologue */
/* .line 220 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 221 */
final String v1 = "mComponentName"; // const-string v1, "mComponentName"
v2 = this.a;
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 222 */
final String v1 = "mTitle"; // const-string v1, "mTitle"
v2 = this.b;
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 223 */
final String v1 = "mUrl"; // const-string v1, "mUrl"
v2 = this.c;
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 224 */
final String v1 = "mMd5"; // const-string v1, "mMd5"
v2 = this.d;
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 225 */
final String v1 = "mTargetMd5"; // const-string v1, "mTargetMd5"
v2 = this.e;
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 226 */
final String v1 = "reporturls"; // const-string v1, "reporturls"
v2 = this.f;
(( android.os.Bundle ) v0 ).putStringArray ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V
/* .line 227 */
final String v1 = "rich_notification"; // const-string v1, "rich_notification"
/* iget-boolean v2, p0, Lcom/umeng/common/net/a$a;->g:Z */
(( android.os.Bundle ) v0 ).putBoolean ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 228 */
} // .end method
