public class com.a.f.m {
	 /* # static fields */
	 public static b;
	 /* # instance fields */
	 public com.a.f.l a;
	 com.a.e.i c;
	 /* # direct methods */
	 public com.a.f.m ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.c = p2;
		 /* new-instance v0, Lcom/a/f/l; */
		 v1 = this.c;
		 /* invoke-direct {v0, p1, v1}, Lcom/a/f/l;-><init>(Landroid/content/Context;Lcom/a/e/i;)V */
		 this.a = v0;
		 /* const/16 v0, 0x3a */
		 /* new-array v0, v0, [I */
		 (( com.a.f.m ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/a/f/m;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 4 */
		 int v0 = 0; // const/4 v0, 0x0
		 v1 = this.a;
		 (( com.a.f.l ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/a/f/l;->a()[I
		 v2 = com.a.f.m.b;
		 /* aget v3, v1, v0 */
		 /* aput v3, v2, v0 */
		 /* aget v2, v1, v0 */
		 int v3 = -1; // const/4 v3, -0x1
		 /* if-eq v2, v3, :cond_0 */
	 } // :goto_0
	 /* const/16 v2, 0x3a */
	 /* if-lt v0, v2, :cond_1 */
} // :cond_0
return;
} // :cond_1
v2 = com.a.f.m.b;
/* aget v3, v1, v0 */
/* aput v3, v2, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 2 */
v0 = com.a.f.m.b;
/* aput p2, v0, p1 */
v0 = this.a;
v1 = com.a.f.m.b;
/* aget v1, v1, p1 */
(( com.a.f.l ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lcom/a/f/l;->a(II)V
return;
} // .end method
public void b ( ) {
/* .locals 2 */
v0 = this.a;
v1 = com.a.f.m.b;
(( com.a.f.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/f/l;->a([I)V
return;
} // .end method
