public abstract class com.google.ads.util.i$a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/util/i; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x401 */
/* name = "a" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* # instance fields */
protected java.lang.Object a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TT;" */
/* } */
} // .end annotation
} // .end field
protected final java.lang.String b;
final com.google.ads.util.i c; //synthetic
/* # direct methods */
private com.google.ads.util.i$a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 85 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0}, Lcom/google/ads/util/i$a;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;Ljava/lang/Object;)V */
/* .line 86 */
return;
} // .end method
 com.google.ads.util.i$a ( ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 80 */
/* invoke-direct {p0, p1, p2}, Lcom/google/ads/util/i$a;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;)V */
return;
} // .end method
private com.google.ads.util.i$a ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "TT;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 88 */
this.c = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 89 */
this.b = p2;
/* .line 91 */
com.google.ads.util.i .a ( p1,p0 );
/* .line 92 */
this.a = p3;
/* .line 93 */
return;
} // .end method
 com.google.ads.util.i$a ( ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 80 */
/* invoke-direct {p0, p1, p2, p3}, Lcom/google/ads/util/i$a;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;Ljava/lang/Object;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 103 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.c;
(( com.google.ads.util.i ) v1 ).toString ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "."; // const-string v1, "."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " = "; // const-string v1, " = "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
