public class com.doodlemobile.basket.ui.UIViewGroup extends com.doodlemobile.basket.ui.e {
	 /* # instance fields */
	 protected com.doodlemobile.basket.ui.e a;
	 protected Integer q;
	 protected com.doodlemobile.basket.ui.e r;
	 public Boolean s;
	 /* # direct methods */
	 public com.doodlemobile.basket.ui.UIViewGroup ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/ui/e;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->s:Z */
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a()V */
		 return;
	 } // .end method
	 public com.doodlemobile.basket.ui.UIViewGroup ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->s:Z */
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a()V */
		 return;
	 } // .end method
	 private void a ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0xc */
		 /* new-array v0, v0, [Lcom/doodlemobile/basket/ui/e; */
		 this.a = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final com.doodlemobile.basket.ui.e a ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 /* aget-object v0, v0, p1 */
	 } // .end method
	 public void a ( Integer p0, Integer p1 ) {
		 /* .locals 4 */
		 /* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;->a(II)V */
		 v0 = this.a;
		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 /* if-ge v2, v1, :cond_0 */
	 /* aget-object v3, v0, v2 */
	 (( com.doodlemobile.basket.ui.e ) v3 ).a ( p1, p2 ); // invoke-virtual {v3, p1, p2}, Lcom/doodlemobile/basket/ui/e;->a(II)V
	 /* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
return;
} // .end method
public void a ( Long p0 ) {
/* .locals 4 */
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;->a(J)V */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.a;
	 /* iget v1, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, v0, v2 */
(( com.doodlemobile.basket.ui.e ) v3 ).a ( p1, p2 ); // invoke-virtual {v3, p1, p2}, Lcom/doodlemobile/basket/ui/e;->a(J)V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 4 */
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/opengl/m;)V */
v0 = this.a;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, v0, v2 */
(( com.doodlemobile.basket.ui.e ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/opengl/m;)V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 6 */
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/p;)V */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.a;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* aget-object v3, v0, v2 */
/* iget-boolean v4, v3, Lcom/doodlemobile/basket/ui/e;->d:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
/* iget v4, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->g:F */
/* iget v5, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->h:F */
v4 = (( com.doodlemobile.basket.ui.e ) v3 ).g ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lcom/doodlemobile/basket/ui/e;->g(FF)Z
if ( v4 != null) { // if-eqz v4, :cond_0
(( com.doodlemobile.basket.ui.e ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/p;)V
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
/* iget v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
v1 = this.a;
/* iget v2, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
/* array-length v3, v1 */
/* if-ne v0, v2, :cond_0 */
/* if-ne v3, v2, :cond_3 */
/* add-int/lit8 v0, v3, 0xc */
/* new-array v0, v0, [Lcom/doodlemobile/basket/ui/e; */
this.a = v0;
v0 = this.a;
java.lang.System .arraycopy ( v1,v4,v0,v4,v3 );
v0 = this.a;
} // :goto_0
/* iget v1, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
/* aput-object p1, v0, v1 */
} // :goto_1
(( com.doodlemobile.basket.ui.e ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/ui/UIViewGroup;)V
return;
} // :cond_0
/* if-ge v0, v2, :cond_2 */
/* if-ne v3, v2, :cond_1 */
/* add-int/lit8 v3, v3, 0xc */
/* new-array v3, v3, [Lcom/doodlemobile/basket/ui/e; */
this.a = v3;
v3 = this.a;
java.lang.System .arraycopy ( v1,v4,v3,v4,v0 );
v3 = this.a;
/* add-int/lit8 v4, v0, 0x1 */
/* sub-int/2addr v2, v0 */
java.lang.System .arraycopy ( v1,v0,v3,v4,v2 );
v1 = this.a;
} // :goto_2
/* aput-object p1, v1, v0 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
} // :cond_1
/* add-int/lit8 v3, v0, 0x1 */
/* sub-int/2addr v2, v0 */
java.lang.System .arraycopy ( v1,v0,v1,v3,v2 );
} // :cond_2
/* new-instance v1, Ljava/lang/IndexOutOfBoundsException; */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "index="; // const-string v4, "index="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = " count="; // const-string v3, " count="
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // :cond_3
/* move-object v0, v1 */
} // .end method
protected void a ( Boolean p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 13 */
/* invoke-super/range {p0 ..p5}, Lcom/doodlemobile/basket/ui/e;->a(ZFFFF)V */
/* if-nez p1, :cond_0 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
v0 = this.a;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
/* sub-float v2, p4, p2 */
/* sub-float v3, p5, p3 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v1, :cond_1 */
/* aget-object v5, v0, v4 */
v6 = this.c;
/* iget v7, v6, Lcom/doodlemobile/basket/ui/b;->i:F */
/* mul-float/2addr v7, v2 */
/* iget v8, v6, Lcom/doodlemobile/basket/ui/b;->c:F */
/* add-float/2addr v7, v8 */
/* iget v8, v6, Lcom/doodlemobile/basket/ui/b;->j:F */
/* mul-float/2addr v8, v3 */
/* iget v9, v6, Lcom/doodlemobile/basket/ui/b;->d:F */
/* add-float/2addr v8, v9 */
v9 = (( com.doodlemobile.basket.ui.e ) v5 ).k ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/ui/e;->k()F
v10 = (( com.doodlemobile.basket.ui.e ) v5 ).p ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/ui/e;->p()F
/* const/high16 v11, -0x41000000 # -0.5f */
/* iget v12, v6, Lcom/doodlemobile/basket/ui/b;->g:F */
/* sub-float/2addr v11, v12 */
/* mul-float/2addr v11, v9 */
/* add-float/2addr v7, v11 */
/* add-float/2addr v9, v7 */
/* const/high16 v11, -0x41000000 # -0.5f */
/* iget v6, v6, Lcom/doodlemobile/basket/ui/b;->h:F */
/* sub-float v6, v11, v6 */
/* mul-float/2addr v6, v10 */
/* add-float/2addr v6, v8 */
/* add-float v8, v6, v10 */
(( com.doodlemobile.basket.ui.e ) v5 ).a ( v7, v6, v9, v8 ); // invoke-virtual {v5, v7, v6, v9, v8}, Lcom/doodlemobile/basket/ui/e;->a(FFFF)V
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
return;
} // .end method
public Boolean a ( Object p0 ) {
/* .locals 12 */
int v11 = 0; // const/4 v11, 0x0
int v10 = 0; // const/4 v10, 0x0
int v9 = 1; // const/4 v9, 0x1
v0 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
v1 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
v2 = (( com.doodlemobile.basket.util.e ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->b()F
v3 = (( com.doodlemobile.basket.ui.UIViewGroup ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a(FF)F
v4 = (( com.doodlemobile.basket.ui.UIViewGroup ) p0 ).b ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/doodlemobile/basket/ui/UIViewGroup;->b(FF)F
/* if-nez v0, :cond_3 */
/* iget-boolean v5, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->d:Z */
/* if-nez v5, :cond_0 */
/* move v0, v10 */
} // :goto_0
} // :cond_0
v5 = this.r;
if ( v5 != null) { // if-eqz v5, :cond_1
this.r = v11;
} // :cond_1
/* iget-boolean v5, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->s:Z */
/* if-nez v5, :cond_3 */
(( com.doodlemobile.basket.util.e ) p1 ).a ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Lcom/doodlemobile/basket/util/e;->a(FF)V
v5 = this.a;
/* iget v6, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
/* sub-int/2addr v6, v9 */
} // :goto_1
/* if-ltz v6, :cond_3 */
/* aget-object v7, v5, v6 */
v8 = (( com.doodlemobile.basket.ui.e ) v7 ).e ( v3, v4 ); // invoke-virtual {v7, v3, v4}, Lcom/doodlemobile/basket/ui/e;->e(FF)Z
if ( v8 != null) { // if-eqz v8, :cond_2
v8 = (( com.doodlemobile.basket.ui.e ) v7 ).a ( p1 ); // invoke-virtual {v7, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/util/e;)Z
if ( v8 != null) { // if-eqz v8, :cond_2
this.r = v7;
/* move v0, v9 */
} // :cond_2
/* add-int/lit8 v6, v6, -0x1 */
} // :cond_3
/* if-eq v0, v9, :cond_4 */
int v3 = 3; // const/4 v3, 0x3
/* if-ne v0, v3, :cond_5 */
} // :cond_4
/* move v0, v9 */
} // :goto_2
(( com.doodlemobile.basket.util.e ) p1 ).a ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Lcom/doodlemobile/basket/util/e;->a(FF)V
v1 = this.r;
/* if-nez v1, :cond_7 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
v0 = /* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/util/e;)Z */
} // :cond_5
/* move v0, v10 */
} // :cond_6
/* move v0, v10 */
} // :cond_7
if ( v0 != null) { // if-eqz v0, :cond_8
this.r = v11;
} // :cond_8
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->s:Z */
if ( v0 != null) { // if-eqz v0, :cond_9
this.r = v11;
/* move v0, v9 */
} // :cond_9
(( com.doodlemobile.basket.ui.UIViewGroup ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/ui/UIViewGroup;->b(Lcom/doodlemobile/basket/util/e;)V
v0 = (( com.doodlemobile.basket.ui.e ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/util/e;)Z
} // .end method
public void b ( ) {
/* .locals 4 */
/* invoke-super {p0}, Lcom/doodlemobile/basket/ui/e;->b()V */
v0 = this.a;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, v0, v2 */
(( com.doodlemobile.basket.ui.e ) v3 ).b ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/ui/e;->b()V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 5 */
v0 = this.a;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, v0, v2 */
/* if-ne v3, p1, :cond_1 */
/* aget-object v3, v0, v2 */
int v4 = 0; // const/4 v4, 0x0
(( com.doodlemobile.basket.ui.e ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/ui/UIViewGroup;)V
} // :cond_0
/* if-ge v2, v1, :cond_2 */
/* add-int/lit8 v1, v1, -0x1 */
/* iput v1, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
} // :goto_1
/* if-ge v2, v1, :cond_3 */
/* add-int/lit8 v3, v2, 0x1 */
/* aget-object v3, v0, v3 */
/* aput-object v3, v0, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
final String v0 = "Basket"; // const-string v0, "Basket"
final String v1 = "remove warning, no such child "; // const-string v1, "remove warning, no such child "
android.util.Log .w ( v0,v1 );
} // :cond_3
return;
} // .end method
protected final com.doodlemobile.basket.ui.e c ( Integer p0 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
v0 = this.a;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
/* move v2, v5 */
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* aget-object v3, v0, v2 */
v4 = (( com.doodlemobile.basket.ui.e ) v3 ).g ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/ui/e;->g()I
/* if-ne v4, p1, :cond_0 */
/* move-object v0, v3 */
} // :goto_1
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
/* move v2, v5 */
} // :goto_2
/* if-ge v2, v1, :cond_3 */
/* aget-object v3, v0, v2 */
(( com.doodlemobile.basket.ui.e ) v3 ).c ( p1 ); // invoke-virtual {v3, p1}, Lcom/doodlemobile/basket/ui/e;->c(I)Lcom/doodlemobile/basket/ui/e;
if ( v3 != null) { // if-eqz v3, :cond_2
/* move-object v0, v3 */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final void c ( ) {
/* .locals 4 */
/* invoke-super {p0}, Lcom/doodlemobile/basket/ui/e;->c()V */
v0 = this.a;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, v0, v2 */
(( com.doodlemobile.basket.ui.e ) v3 ).c ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/ui/e;->c()V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
return;
} // .end method
public final Integer t ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/UIViewGroup;->q:I */
} // .end method
