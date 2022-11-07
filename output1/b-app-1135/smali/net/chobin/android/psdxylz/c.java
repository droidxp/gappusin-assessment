public abstract class net.chobin.android.psdxylz.c {
	 /* # instance fields */
	 public Integer q;
	 public Integer r;
	 public Integer s;
	 public Integer t;
	 public Integer u;
	 public Integer v;
	 public Integer w;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.c ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 (( net.chobin.android.psdxylz.c ) p0 ).b ( v0, v0, v0 ); // invoke-virtual {p0, v0, v0, v0}, Lnet/chobin/android/psdxylz/c;->b(III)V
		 return;
	 } // .end method
	 private static Integer a ( Object[] p0, Integer p1, Integer p2 ) {
		 /* .locals 3 */
		 /* const v1, -0x3b9ac9ff */
		 /* aget-object v0, p0, p1 */
		 /* if-nez v0, :cond_0 */
		 /* move v0, v1 */
	 } // :goto_0
	 /* aget-object v2, p0, p2 */
	 /* if-nez v2, :cond_1 */
} // :goto_1
/* if-ne v0, v1, :cond_2 */
/* aget-object v2, p0, p1 */
if ( v2 != null) { // if-eqz v2, :cond_2
	 /* aget-object v2, p0, p2 */
	 if ( v2 != null) { // if-eqz v2, :cond_2
		 /* sub-int v0, p1, p2 */
	 } // :goto_2
} // :cond_0
/* aget-object v0, p0, p1 */
/* iget v0, v0, Lnet/chobin/android/psdxylz/c;->r:I */
} // :cond_1
/* aget-object v1, p0, p2 */
/* iget v1, v1, Lnet/chobin/android/psdxylz/c;->r:I */
} // :cond_2
/* sub-int/2addr v0, v1 */
} // .end method
private static Integer a ( Object[] p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 4 */
/* move v1, p2 */
/* move v0, p1 */
} // :goto_0
/* if-le v0, v1, :cond_2 */
} // :cond_0
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
/* if-gt v0, p2, :cond_3 */
v2 = net.chobin.android.psdxylz.c .a ( p0,v0,p3 );
/* if-ltz v2, :cond_1 */
} // :cond_3
} // :goto_1
/* if-lt v1, p1, :cond_4 */
v2 = net.chobin.android.psdxylz.c .a ( p0,v1,p3 );
/* if-gez v2, :cond_5 */
} // :cond_4
/* if-gt v0, v1, :cond_0 */
/* aget-object v2, p0, v0 */
/* aget-object v3, p0, v1 */
/* aput-object v3, p0, v0 */
/* aput-object v2, p0, v1 */
/* add-int/lit8 v0, v0, 0x1 */
/* add-int/lit8 v1, v1, -0x1 */
} // :cond_5
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
public static void a ( Object[] p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
/* add-int/lit8 v1, v1, -0x1 */
net.chobin.android.psdxylz.c .a ( p0,v0,v1 );
return;
} // .end method
public static void a ( Object[] p0, Integer p1 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* add-int/lit8 v1, p1, -0x1 */
net.chobin.android.psdxylz.c .a ( p0,v0,v1 );
return;
} // .end method
private static void a ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* if-ne p1, p2, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = net.chobin.android.psdxylz.c .b ( p0,p1,p2 );
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
v0 = net.chobin.android.psdxylz.c .a ( p0,p1,p2,v0 );
/* add-int/lit8 v1, v0, -0x1 */
net.chobin.android.psdxylz.c .a ( p0,p1,v1 );
net.chobin.android.psdxylz.c .a ( p0,v0,p2 );
} // .end method
private static Integer b ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* add-int/lit8 v0, p1, 0x1 */
} // :goto_0
/* if-gt v0, p2, :cond_0 */
v1 = net.chobin.android.psdxylz.c .a ( p0,p1,v0 );
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_0
/* if-le v0, p2, :cond_3 */
int p1 = -1; // const/4 p1, -0x1
} // :cond_1
} // :goto_1
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
v1 = net.chobin.android.psdxylz.c .a ( p0,p1,v0 );
/* if-gez v1, :cond_1 */
/* move p1, v0 */
} // .end method
/* # virtual methods */
public Long a ( Object p0 ) {
/* .locals 8 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/c;->q:I */
/* div-int/lit8 v0, v0, 0x64 */
/* int-to-long v0, v0 */
/* iget v2, p0, Lnet/chobin/android/psdxylz/c;->r:I */
/* div-int/lit8 v2, v2, 0x64 */
/* int-to-long v2, v2 */
/* iget v4, p1, Lnet/chobin/android/psdxylz/c;->q:I */
/* div-int/lit8 v4, v4, 0x64 */
/* int-to-long v4, v4 */
/* iget v6, p1, Lnet/chobin/android/psdxylz/c;->r:I */
/* div-int/lit8 v6, v6, 0x64 */
/* int-to-long v6, v6 */
/* invoke-static/range {v0 ..v7}, Lnet/chobin/android/psdxylz/app/s;->a(JJJJ)J */
/* move-result-wide v0 */
/* const-wide/16 v2, 0x64 */
/* mul-long/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public Boolean a ( Object p0 ) {
/* .locals 4 */
(( net.chobin.android.psdxylz.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lnet/chobin/android/psdxylz/c;->a(Lnet/chobin/android/psdxylz/c;)J
/* move-result-wide v0 */
v2 = (( net.chobin.android.psdxylz.c ) p0 ).g ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/c;->g()I
v3 = (( net.chobin.android.psdxylz.c ) p1 ).g ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/c;->g()I
/* add-int/2addr v2, v3 */
/* int-to-long v2, v2 */
/* cmp-long v0, v0, v2 */
/* if-gez v0, :cond_0 */
/* iget v0, p1, Lnet/chobin/android/psdxylz/c;->s:I */
v1 = (( net.chobin.android.psdxylz.c ) p1 ).h ( ); // invoke-virtual {p1}, Lnet/chobin/android/psdxylz/c;->h()I
/* add-int/2addr v0, v1 */
/* iget v1, p0, Lnet/chobin/android/psdxylz/c;->s:I */
/* if-le v0, v1, :cond_0 */
/* iget v0, p1, Lnet/chobin/android/psdxylz/c;->s:I */
/* iget v1, p0, Lnet/chobin/android/psdxylz/c;->s:I */
v2 = (( net.chobin.android.psdxylz.c ) p0 ).h ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/c;->h()I
/* add-int/2addr v1, v2 */
/* if-ge v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void b ( Integer p0 ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* iget v0, p0, Lnet/chobin/android/psdxylz/c;->t:I */
/* if-eq v0, p1, :cond_0 */
/* iput p1, p0, Lnet/chobin/android/psdxylz/c;->t:I */
/* iput v1, p0, Lnet/chobin/android/psdxylz/c;->v:I */
/* iput v1, p0, Lnet/chobin/android/psdxylz/c;->u:I */
} // :cond_0
return;
} // .end method
public void b ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput p1, p0, Lnet/chobin/android/psdxylz/c;->q:I */
/* iput p2, p0, Lnet/chobin/android/psdxylz/c;->r:I */
/* iput p3, p0, Lnet/chobin/android/psdxylz/c;->s:I */
/* iput v0, p0, Lnet/chobin/android/psdxylz/c;->u:I */
/* iput v0, p0, Lnet/chobin/android/psdxylz/c;->v:I */
/* iput v0, p0, Lnet/chobin/android/psdxylz/c;->t:I */
/* iput v0, p0, Lnet/chobin/android/psdxylz/c;->w:I */
return;
} // .end method
public abstract Integer e ( ) {
} // .end method
public abstract Integer f ( ) {
} // .end method
public abstract Integer g ( ) {
} // .end method
public abstract Integer h ( ) {
} // .end method
