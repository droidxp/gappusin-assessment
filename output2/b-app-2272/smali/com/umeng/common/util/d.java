public abstract class com.umeng.common.util.d {
	 /* .source "BaseNCodec.java" */
	 /* # static fields */
	 private static final Integer a;
	 public static final Integer b;
	 public static final Integer c;
	 protected static final Integer d;
	 protected static final Object e;
	 private static final Integer m;
	 /* # instance fields */
	 protected final Object f;
	 protected final Integer g;
	 protected h;
	 protected Integer i;
	 protected Boolean j;
	 protected Integer k;
	 protected Integer l;
	 private final Integer n;
	 private final Integer o;
	 private final Integer p;
	 private Integer q;
	 /* # direct methods */
	 protected com.umeng.common.util.d ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 131 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 70 */
		 /* const/16 v0, 0x3d */
		 /* iput-byte v0, p0, Lcom/umeng/common/util/d;->f:B */
		 /* .line 132 */
		 /* iput p1, p0, Lcom/umeng/common/util/d;->n:I */
		 /* .line 133 */
		 /* iput p2, p0, Lcom/umeng/common/util/d;->o:I */
		 /* .line 134 */
		 /* if-lez p3, :cond_0 */
		 /* if-lez p4, :cond_0 */
		 /* div-int v0, p3, p2 */
		 /* mul-int/2addr v0, p2 */
	 } // :goto_0
	 /* iput v0, p0, Lcom/umeng/common/util/d;->g:I */
	 /* .line 135 */
	 /* iput p4, p0, Lcom/umeng/common/util/d;->p:I */
	 /* .line 136 */
	 return;
	 /* .line 134 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private void a ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 167 */
v0 = this.h;
/* if-nez v0, :cond_0 */
/* .line 168 */
v0 = (( com.umeng.common.util.d ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/umeng/common/util/d;->d()I
/* new-array v0, v0, [B */
this.h = v0;
/* .line 169 */
/* iput v3, p0, Lcom/umeng/common/util/d;->i:I */
/* .line 170 */
/* iput v3, p0, Lcom/umeng/common/util/d;->q:I */
/* .line 176 */
} // :goto_0
return;
/* .line 172 */
} // :cond_0
v0 = this.h;
/* array-length v0, v0 */
/* mul-int/lit8 v0, v0, 0x2 */
/* new-array v0, v0, [B */
/* .line 173 */
v1 = this.h;
v2 = this.h;
/* array-length v2, v2 */
java.lang.System .arraycopy ( v1,v3,v0,v3,v2 );
/* .line 174 */
this.h = v0;
} // .end method
protected static Boolean c ( Object p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 222 */
/* sparse-switch p0, :sswitch_data_0 */
/* .line 229 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* .line 227 */
/* :sswitch_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 222 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x9 -> :sswitch_0 */
/* 0xa -> :sswitch_0 */
/* 0xd -> :sswitch_0 */
/* 0x20 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
private void e ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 237 */
int v0 = 0; // const/4 v0, 0x0
this.h = v0;
/* .line 238 */
/* iput v1, p0, Lcom/umeng/common/util/d;->i:I */
/* .line 239 */
/* iput v1, p0, Lcom/umeng/common/util/d;->q:I */
/* .line 240 */
/* iput v1, p0, Lcom/umeng/common/util/d;->k:I */
/* .line 241 */
/* iput v1, p0, Lcom/umeng/common/util/d;->l:I */
/* .line 242 */
/* iput-boolean v1, p0, Lcom/umeng/common/util/d;->j:Z */
/* .line 243 */
return;
} // .end method
/* # virtual methods */
public java.lang.Object a ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 256 */
/* instance-of v0, p1, [B */
/* if-nez v0, :cond_0 */
/* .line 257 */
/* new-instance v0, Ljava/lang/Exception; */
final String v1 = "Parameter supplied to Base-N encode is not a byte[]"; // const-string v1, "Parameter supplied to Base-N encode is not a byte[]"
/* invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 259 */
} // :cond_0
/* check-cast p1, [B */
(( com.umeng.common.util.d ) p0 ).l ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/common/util/d;->l([B)[B
} // .end method
protected void a ( Integer p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 184 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.h;
/* array-length v0, v0 */
/* iget v1, p0, Lcom/umeng/common/util/d;->i:I */
/* add-int/2addr v1, p1 */
/* if-ge v0, v1, :cond_1 */
/* .line 185 */
} // :cond_0
/* invoke-direct {p0}, Lcom/umeng/common/util/d;->a()V */
/* .line 187 */
} // :cond_1
return;
} // .end method
abstract void a ( Object[] p0, Integer p1, Integer p2 ) {
} // .end method
public java.lang.Object b ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 284 */
/* instance-of v0, p1, [B */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 285 */
/* check-cast p1, [B */
(( com.umeng.common.util.d ) p0 ).k ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/common/util/d;->k([B)[B
/* .line 287 */
} // :goto_0
/* .line 286 */
} // :cond_0
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 287 */
/* check-cast p1, Ljava/lang/String; */
(( com.umeng.common.util.d ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/common/util/d;->c(Ljava/lang/String;)[B
/* .line 289 */
} // :cond_1
/* new-instance v0, Ljava/lang/Exception; */
final String v1 = "Parameter supplied to Base-N decode is not a byte[] or a String"; // const-string v1, "Parameter supplied to Base-N decode is not a byte[] or a String"
/* invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
abstract void b ( Object[] p0, Integer p1, Integer p2 ) {
} // .end method
Boolean b ( ) {
/* .locals 1 */
/* .prologue */
/* .line 144 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected abstract Boolean b ( Object p0 ) {
} // .end method
public Boolean b ( Object[] p0, Boolean p1 ) {
/* .locals 4 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 378 */
/* move v0, v1 */
} // :goto_0
/* array-length v2, p1 */
/* if-lt v0, v2, :cond_1 */
/* .line 384 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
/* .line 379 */
} // :cond_1
/* aget-byte v2, p1, v0 */
v2 = (( com.umeng.common.util.d ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Lcom/umeng/common/util/d;->b(B)Z
/* if-nez v2, :cond_2 */
/* .line 380 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* aget-byte v2, p1, v0 */
/* const/16 v3, 0x3d */
/* if-eq v2, v3, :cond_2 */
/* aget-byte v2, p1, v0 */
v2 = com.umeng.common.util.d .c ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 378 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
Integer c ( ) {
/* .locals 2 */
/* .prologue */
/* .line 153 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lcom/umeng/common/util/d;->i:I */
/* iget v1, p0, Lcom/umeng/common/util/d;->q:I */
/* sub-int/2addr v0, v1 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
Integer c ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .prologue */
/* .line 202 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 203 */
v0 = (( com.umeng.common.util.d ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/umeng/common/util/d;->c()I
v0 = java.lang.Math .min ( v0,p3 );
/* .line 204 */
v1 = this.h;
/* iget v2, p0, Lcom/umeng/common/util/d;->q:I */
java.lang.System .arraycopy ( v1,v2,p1,p2,v0 );
/* .line 205 */
/* iget v1, p0, Lcom/umeng/common/util/d;->q:I */
/* add-int/2addr v1, v0 */
/* iput v1, p0, Lcom/umeng/common/util/d;->q:I */
/* .line 206 */
/* iget v1, p0, Lcom/umeng/common/util/d;->q:I */
/* iget v2, p0, Lcom/umeng/common/util/d;->i:I */
/* if-lt v1, v2, :cond_0 */
/* .line 207 */
int v1 = 0; // const/4 v1, 0x0
this.h = v1;
/* .line 211 */
} // :cond_0
} // :goto_0
} // :cond_1
/* iget-boolean v0, p0, Lcom/umeng/common/util/d;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
int v0 = -1; // const/4 v0, -0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public c ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 301 */
com.umeng.common.util.a .f ( p1 );
(( com.umeng.common.util.d ) p0 ).k ( v0 ); // invoke-virtual {p0, v0}, Lcom/umeng/common/util/d;->k([B)[B
} // .end method
protected Integer d ( ) {
/* .locals 1 */
/* .prologue */
/* .line 162 */
/* const/16 v0, 0x2000 */
} // .end method
public Boolean d ( java.lang.String p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 397 */
com.umeng.common.util.a .f ( p1 );
int v1 = 1; // const/4 v1, 0x1
v0 = (( com.umeng.common.util.d ) p0 ).b ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/umeng/common/util/d;->b([BZ)Z
} // .end method
public java.lang.String j ( Object[] p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 270 */
(( com.umeng.common.util.d ) p0 ).l ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/common/util/d;->l([B)[B
com.umeng.common.util.a .f ( v0 );
} // .end method
public k ( Object[] p0 ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 312 */
/* invoke-direct {p0}, Lcom/umeng/common/util/d;->e()V */
/* .line 313 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* array-length v0, p1 */
/* if-nez v0, :cond_1 */
/* .line 320 */
} // :cond_0
} // :goto_0
/* .line 316 */
} // :cond_1
/* array-length v0, p1 */
(( com.umeng.common.util.d ) p0 ).b ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Lcom/umeng/common/util/d;->b([BII)V
/* .line 317 */
int v0 = -1; // const/4 v0, -0x1
(( com.umeng.common.util.d ) p0 ).b ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Lcom/umeng/common/util/d;->b([BII)V
/* .line 318 */
/* iget v0, p0, Lcom/umeng/common/util/d;->i:I */
/* new-array p1, v0, [B */
/* .line 319 */
/* array-length v0, p1 */
(( com.umeng.common.util.d ) p0 ).c ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Lcom/umeng/common/util/d;->c([BII)I
} // .end method
public l ( Object[] p0 ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 331 */
/* invoke-direct {p0}, Lcom/umeng/common/util/d;->e()V */
/* .line 332 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* array-length v0, p1 */
/* if-nez v0, :cond_1 */
/* .line 339 */
} // :cond_0
} // :goto_0
/* .line 335 */
} // :cond_1
/* array-length v0, p1 */
(( com.umeng.common.util.d ) p0 ).a ( p1, v2, v0 ); // invoke-virtual {p0, p1, v2, v0}, Lcom/umeng/common/util/d;->a([BII)V
/* .line 336 */
int v0 = -1; // const/4 v0, -0x1
(( com.umeng.common.util.d ) p0 ).a ( p1, v2, v0 ); // invoke-virtual {p0, p1, v2, v0}, Lcom/umeng/common/util/d;->a([BII)V
/* .line 337 */
/* iget v0, p0, Lcom/umeng/common/util/d;->i:I */
/* iget v1, p0, Lcom/umeng/common/util/d;->q:I */
/* sub-int/2addr v0, v1 */
/* new-array p1, v0, [B */
/* .line 338 */
/* array-length v0, p1 */
(( com.umeng.common.util.d ) p0 ).c ( p1, v2, v0 ); // invoke-virtual {p0, p1, v2, v0}, Lcom/umeng/common/util/d;->c([BII)I
} // .end method
public java.lang.String m ( Object[] p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 350 */
(( com.umeng.common.util.d ) p0 ).l ( p1 ); // invoke-virtual {p0, p1}, Lcom/umeng/common/util/d;->l([B)[B
com.umeng.common.util.a .f ( v0 );
} // .end method
protected Boolean n ( Object[] p0 ) {
/* .locals 4 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 410 */
/* if-nez p1, :cond_1 */
/* .line 418 */
} // :cond_0
} // :goto_0
} // :cond_1
/* move v0, v1 */
/* .line 413 */
} // :goto_1
/* array-length v2, p1 */
/* if-ge v0, v2, :cond_0 */
/* .line 414 */
/* const/16 v2, 0x3d */
/* aget-byte v3, p1, v0 */
/* if-eq v2, v3, :cond_2 */
/* aget-byte v2, p1, v0 */
v2 = (( com.umeng.common.util.d ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Lcom/umeng/common/util/d;->b(B)Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 415 */
} // :cond_2
int v1 = 1; // const/4 v1, 0x1
/* .line 413 */
} // :cond_3
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public Long o ( Object[] p0 ) {
/* .locals 6 */
/* .prologue */
/* .line 432 */
/* array-length v0, p1 */
/* iget v1, p0, Lcom/umeng/common/util/d;->n:I */
/* add-int/2addr v0, v1 */
/* add-int/lit8 v0, v0, -0x1 */
/* iget v1, p0, Lcom/umeng/common/util/d;->n:I */
/* div-int/2addr v0, v1 */
/* int-to-long v0, v0 */
/* iget v2, p0, Lcom/umeng/common/util/d;->o:I */
/* int-to-long v2, v2 */
/* mul-long/2addr v0, v2 */
/* .line 433 */
/* iget v2, p0, Lcom/umeng/common/util/d;->g:I */
/* if-lez v2, :cond_0 */
/* .line 435 */
/* iget v2, p0, Lcom/umeng/common/util/d;->g:I */
/* int-to-long v2, v2 */
/* add-long/2addr v2, v0 */
/* const-wide/16 v4, 0x1 */
/* sub-long/2addr v2, v4 */
/* iget v4, p0, Lcom/umeng/common/util/d;->g:I */
/* int-to-long v4, v4 */
/* div-long/2addr v2, v4 */
/* iget v4, p0, Lcom/umeng/common/util/d;->p:I */
/* int-to-long v4, v4 */
/* mul-long/2addr v2, v4 */
/* add-long/2addr v0, v2 */
/* .line 437 */
} // :cond_0
/* return-wide v0 */
} // .end method
