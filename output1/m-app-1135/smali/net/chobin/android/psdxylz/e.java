public class net.chobin.android.psdxylz.e extends net.chobin.android.psdxylz.c {
	 /* # static fields */
	 public static final a;
	 public static final I a;
	 public static final b;
	 /* # instance fields */
	 public Integer a;
	 /* # direct methods */
	 static net.chobin.android.psdxylz.e ( ) {
		 /* .locals 5 */
		 int v1 = 4; // const/4 v1, 0x4
		 int v4 = 2; // const/4 v4, 0x2
		 int v3 = 1; // const/4 v3, 0x1
		 /* new-array v0, v1, [I */
		 /* fill-array-data v0, :array_0 */
		 /* new-array v0, v1, [I */
		 /* fill-array-data v0, :array_1 */
		 /* new-array v0, v4, [[I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-array v2, v3, [I */
		 /* aput-object v2, v0, v1 */
		 /* new-array v1, v4, [I */
		 /* aput v3, v1, v3 */
		 /* aput-object v1, v0, v3 */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x59d8 */
		 /* 0xcc588 */
		 /* 0x59d8 */
		 /* 0xcc588 */
	 } // .end array-data
	 /* :array_1 */
	 /* .array-data 4 */
	 /* 0xbf68 */
	 /* 0xbf68 */
	 /* 0x13ca68 */
	 /* 0x13ca68 */
} // .end array-data
} // .end method
public net.chobin.android.psdxylz.e ( ) {
/* .locals 2 */
/* invoke-direct {p0}, Lnet/chobin/android/psdxylz/c;-><init>()V */
/* iput p1, p0, Lnet/chobin/android/psdxylz/e;->a:I */
v0 = net.chobin.android.psdxylz.e.a;
/* aget v0, v0, p1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/e;->q:I */
v0 = net.chobin.android.psdxylz.e.b;
/* aget v0, v0, p1 */
/* const v1, 0x8ca0 */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/e;->r:I */
return;
} // .end method
public static net.chobin.android.psdxylz.e a ( ) {
/* .locals 6 */
int v5 = 3; // const/4 v5, 0x3
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v0 = 0; // const/4 v0, 0x0
int v1 = 4; // const/4 v1, 0x4
/* new-array v1, v1, [Lnet/chobin/android/psdxylz/e; */
/* new-instance v2, Lnet/chobin/android/psdxylz/e; */
/* invoke-direct {v2, v0}, Lnet/chobin/android/psdxylz/e;-><init>(I)V */
/* aput-object v2, v1, v0 */
/* new-instance v2, Lnet/chobin/android/psdxylz/e; */
/* invoke-direct {v2, v3}, Lnet/chobin/android/psdxylz/e;-><init>(I)V */
/* aput-object v2, v1, v3 */
/* new-instance v2, Lnet/chobin/android/psdxylz/e; */
/* invoke-direct {v2, v4}, Lnet/chobin/android/psdxylz/e;-><init>(I)V */
/* aput-object v2, v1, v4 */
/* new-instance v2, Lnet/chobin/android/psdxylz/e; */
/* invoke-direct {v2, v5}, Lnet/chobin/android/psdxylz/e;-><init>(I)V */
/* aput-object v2, v1, v5 */
} // :goto_0
/* array-length v2, v1 */
/* if-lt v0, v2, :cond_0 */
} // :cond_0
/* aget-object v2, v1, v0 */
(( net.chobin.android.psdxylz.e ) v2 ).b ( v3 ); // invoke-virtual {v2, v3}, Lnet/chobin/android/psdxylz/e;->b(I)V
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 2 */
v0 = net.chobin.android.psdxylz.e.a;
/* iget v1, p0, Lnet/chobin/android/psdxylz/e;->t:I */
/* aget-object v0, v0, v1 */
/* iget v1, p0, Lnet/chobin/android/psdxylz/e;->v:I */
/* aget v0, v0, v1 */
/* mul-int/lit8 v0, v0, 0x10 */
} // .end method
public void a ( ) {
/* .locals 3 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/e;->u:I */
/* div-int/lit16 v0, v0, 0xc8 */
v1 = net.chobin.android.psdxylz.e.a;
/* iget v2, p0, Lnet/chobin/android/psdxylz/e;->t:I */
/* aget-object v1, v1, v2 */
/* array-length v1, v1 */
/* rem-int/2addr v0, v1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/e;->v:I */
/* iget v0, p0, Lnet/chobin/android/psdxylz/e;->u:I */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/e;->u:I */
/* iget v0, p0, Lnet/chobin/android/psdxylz/e;->u:I */
v1 = net.chobin.android.psdxylz.e.a;
/* iget v2, p0, Lnet/chobin/android/psdxylz/e;->t:I */
/* aget-object v1, v1, v2 */
/* array-length v1, v1 */
/* mul-int/lit16 v1, v1, 0xc8 */
/* if-lt v0, v1, :cond_0 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/e;->u:I */
v1 = net.chobin.android.psdxylz.e.a;
/* iget v2, p0, Lnet/chobin/android/psdxylz/e;->t:I */
/* aget-object v1, v1, v2 */
/* array-length v1, v1 */
/* mul-int/lit16 v1, v1, 0xc8 */
/* rem-int/2addr v0, v1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/e;->u:I */
} // :cond_0
return;
} // .end method
public Integer b ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer e ( ) {
/* .locals 1 */
/* const/16 v0, 0x10 */
} // .end method
public Integer f ( ) {
/* .locals 1 */
/* const/16 v0, 0x24 */
} // .end method
public Integer g ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer h ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
