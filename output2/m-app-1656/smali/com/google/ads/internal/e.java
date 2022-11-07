public class com.google.ads.internal.e {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 private java.lang.String a;
	 private java.util.HashMap b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.google.ads.internal.e ( ) {
/* .locals 1 */
/* .prologue */
/* .line 58 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 59 */
final String v0 = "action"; // const-string v0, "action"
(( android.os.Bundle ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
this.a = v0;
/* .line 60 */
final String v0 = "params"; // const-string v0, "params"
(( android.os.Bundle ) p1 ).getSerializable ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;
/* invoke-direct {p0, v0}, Lcom/google/ads/internal/e;->a(Ljava/io/Serializable;)Ljava/util/HashMap; */
this.b = v0;
/* .line 61 */
return;
} // .end method
public com.google.ads.internal.e ( ) {
/* .locals 0 */
/* .prologue */
/* .line 70 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 71 */
this.a = p1;
/* .line 72 */
return;
} // .end method
public com.google.ads.internal.e ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 83 */
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/e;-><init>(Ljava/lang/String;)V */
/* .line 84 */
this.b = p2;
/* .line 85 */
return;
} // .end method
private java.util.HashMap a ( java.io.Serializable p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/io/Serializable;", */
/* ")", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 101 */
/* instance-of v0, p1, Ljava/util/HashMap; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 102 */
/* check-cast p1, Ljava/util/HashMap; */
/* .line 104 */
} // :goto_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
/* # virtual methods */
public android.os.Bundle a ( ) {
/* .locals 3 */
/* .prologue */
/* .line 117 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 118 */
final String v1 = "action"; // const-string v1, "action"
v2 = this.a;
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 119 */
final String v1 = "params"; // const-string v1, "params"
v2 = this.b;
(( android.os.Bundle ) v0 ).putSerializable ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
/* .line 121 */
} // .end method
public java.lang.String b ( ) {
/* .locals 1 */
/* .prologue */
/* .line 132 */
v0 = this.a;
} // .end method
public java.util.HashMap c ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 143 */
v0 = this.b;
} // .end method
