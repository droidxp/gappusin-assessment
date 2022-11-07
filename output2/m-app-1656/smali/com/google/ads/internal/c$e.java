class com.google.ads.internal.c$e implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/internal/c; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "e" */
} // .end annotation
/* # instance fields */
private final com.google.ads.internal.d a;
private final java.util.LinkedList b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private final Integer c;
private final Boolean d;
private final java.lang.String e;
/* # direct methods */
public com.google.ads.internal.c$e ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/ads/internal/d;", */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;IZ", */
/* "Ljava/lang/String;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 171 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 172 */
this.a = p1;
/* .line 173 */
this.b = p2;
/* .line 174 */
/* iput p3, p0, Lcom/google/ads/internal/c$e;->c:I */
/* .line 175 */
/* iput-boolean p4, p0, Lcom/google/ads/internal/c$e;->d:Z */
/* .line 176 */
this.e = p5;
/* .line 177 */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 181 */
v0 = this.a;
v1 = this.b;
(( com.google.ads.internal.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->a(Ljava/util/LinkedList;)V
/* .line 182 */
v0 = this.a;
/* iget v1, p0, Lcom/google/ads/internal/c$e;->c:I */
(( com.google.ads.internal.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->a(I)V
/* .line 183 */
v0 = this.a;
/* iget-boolean v1, p0, Lcom/google/ads/internal/c$e;->d:Z */
(( com.google.ads.internal.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->a(Z)V
/* .line 184 */
v0 = this.e;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v0, :cond_0 */
/* .line 185 */
v0 = this.a;
v1 = this.e;
(( com.google.ads.internal.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->a(Ljava/lang/String;)V
/* .line 187 */
} // :cond_0
v0 = this.a;
(( com.google.ads.internal.d ) v0 ).B ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->B()V
/* .line 188 */
return;
} // .end method
