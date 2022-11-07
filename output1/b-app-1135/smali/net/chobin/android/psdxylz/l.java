public class net.chobin.android.psdxylz.l {
	 /* # static fields */
	 public static Integer a;
	 public static final a;
	 public static Integer b;
	 public static final b;
	 public static final Integer c;
	 /* # instance fields */
	 public net.chobin.android.psdxylz.o a;
	 public Integer d;
	 public Integer e;
	 public Integer f;
	 public Integer g;
	 public Integer h;
	 public Integer i;
	 public Integer j;
	 public Integer k;
	 public Integer l;
	 /* # direct methods */
	 static net.chobin.android.psdxylz.l ( ) {
		 /* .locals 2 */
		 int v1 = 5; // const/4 v1, 0x5
		 /* mul-int/lit16 v0, v0, 0x140 */
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* div-int/lit8 v0, v0, 0x5 */
		 /* new-array v0, v1, [I */
		 /* fill-array-data v0, :array_0 */
		 /* new-array v0, v1, [I */
		 /* fill-array-data v0, :array_1 */
		 /* const v0, 0xf618 */
		 /* const v1, 0x23a50 */
		 v0 = 		 net.chobin.android.psdxylz.app.s .a ( v0,v1 );
		 /* const v1, 0x9c400 */
		 /* mul-int/2addr v0, v1 */
		 /* div-int/lit16 v0, v0, 0xc46 */
		 return;
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x64 */
		 /* 0x64 */
		 /* 0x64 */
		 /* 0x64 */
		 /* 0x64 */
	 } // .end array-data
	 /* :array_1 */
	 /* .array-data 4 */
	 /* 0x28 */
	 /* 0x32 */
	 /* 0x28 */
	 /* 0x28 */
	 /* 0x46 */
} // .end array-data
} // .end method
public net.chobin.android.psdxylz.l ( ) {
/* .locals 3 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* mul-int/lit16 v0, v0, 0x140 */
/* div-int/lit8 v0, v0, 0x2 */
/* div-int/lit8 v0, v0, 0x5 */
/* iput p1, p0, Lnet/chobin/android/psdxylz/l;->d:I */
/* iput p2, p0, Lnet/chobin/android/psdxylz/l;->e:I */
/* iput p3, p0, Lnet/chobin/android/psdxylz/l;->f:I */
/* iput p4, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* iput p4, p0, Lnet/chobin/android/psdxylz/l;->h:I */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->i:I */
v0 = net.chobin.android.psdxylz.l.a;
/* aget v0, v0, p1 */
v1 = net.chobin.android.psdxylz.l.a;
/* aget v1, v1, p1 */
v2 = net.chobin.android.psdxylz.l.b;
/* aget v2, v2, p1 */
/* sub-int/2addr v1, v2 */
/* div-int/lit8 v1, v1, 0x2 */
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->j:I */
this.a = p5;
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 3 */
/* const v2, 0x138800 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* add-int/2addr v0, v2 */
/* iget v1, p0, Lnet/chobin/android/psdxylz/l;->i:I */
/* sub-int/2addr v0, v1 */
/* rem-int/2addr v0, v2 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
(( net.chobin.android.psdxylz.l ) p0 ).e ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/l;->e()V
return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* iput p1, p0, Lnet/chobin/android/psdxylz/l;->k:I */
/* iput p2, p0, Lnet/chobin/android/psdxylz/l;->l:I */
return;
} // .end method
public Boolean a ( ) {
/* .locals 5 */
int v1 = 0; // const/4 v1, 0x0
int v0 = 1; // const/4 v0, 0x1
/* iget v2, p0, Lnet/chobin/android/psdxylz/l;->j:I */
/* iget v3, p0, Lnet/chobin/android/psdxylz/l;->k:I */
/* sub-int/2addr v2, v3 */
v3 = net.chobin.android.psdxylz.app.s .a ( v2 );
/* if-lt v3, v4, :cond_3 */
/* if-gez v2, :cond_2 */
(( net.chobin.android.psdxylz.l ) p0 ).c ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/l;->c()V
} // :cond_0
} // :goto_0
/* move v0, v1 */
} // :goto_1
/* iget v2, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* iget v3, p0, Lnet/chobin/android/psdxylz/l;->l:I */
/* const v4, 0x138800 */
v2 = net.chobin.android.psdxylz.app.s .d ( v2,v3,v4 );
v3 = net.chobin.android.psdxylz.app.s .a ( v2 );
/* if-lt v3, v4, :cond_5 */
/* if-lez v2, :cond_4 */
(( net.chobin.android.psdxylz.l ) p0 ).b ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/l;->b()V
} // :cond_1
} // :goto_2
} // :cond_2
/* if-lez v2, :cond_0 */
(( net.chobin.android.psdxylz.l ) p0 ).d ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/l;->d()V
} // :cond_3
/* iget v2, p0, Lnet/chobin/android/psdxylz/l;->k:I */
/* iput v2, p0, Lnet/chobin/android/psdxylz/l;->j:I */
} // :cond_4
/* if-gez v2, :cond_1 */
(( net.chobin.android.psdxylz.l ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/l;->a()V
} // :cond_5
/* iget v1, p0, Lnet/chobin/android/psdxylz/l;->l:I */
/* iput v1, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* move v1, v0 */
} // .end method
public void b ( ) {
/* .locals 2 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* iget v1, p0, Lnet/chobin/android/psdxylz/l;->i:I */
/* add-int/2addr v0, v1 */
/* const v1, 0x138800 */
/* rem-int/2addr v0, v1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
(( net.chobin.android.psdxylz.l ) p0 ).e ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/l;->e()V
return;
} // .end method
public void c ( ) {
/* .locals 2 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->j:I */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->j:I */
(( net.chobin.android.psdxylz.l ) p0 ).f ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/l;->f()V
return;
} // .end method
public void d ( ) {
/* .locals 2 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->j:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->j:I */
(( net.chobin.android.psdxylz.l ) p0 ).f ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/l;->f()V
return;
} // .end method
public void e ( ) {
/* .locals 7 */
/* const v6, 0x75300 */
/* const v5, 0x6c660 */
/* const v4, 0x9c400 */
/* const v3, 0x27100 */
/* const v2, 0x138800 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->d:I */
/* packed-switch v0, :pswitch_data_0 */
} // :cond_0
} // :goto_0
return;
/* :pswitch_0 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->e:I */
/* if-ge v0, v5, :cond_2 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* const v1, 0x445c0 */
/* if-le v0, v1, :cond_1 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* if-ge v0, v4, :cond_1 */
/* const v0, 0x445c0 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
} // :cond_1
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* if-lt v0, v4, :cond_0 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* const v1, 0xf4240 */
/* if-ge v0, v1, :cond_0 */
/* const v0, 0xf4240 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
} // :cond_2
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* if-ltz v0, :cond_3 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* const v1, 0x57e40 */
/* if-ge v0, v1, :cond_3 */
/* const v0, 0x57e40 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
} // :cond_3
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* const v1, 0xe09c0 */
/* if-le v0, v1, :cond_0 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* if-ge v0, v2, :cond_0 */
/* const v0, 0xe09c0 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* :pswitch_1 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->e:I */
/* if-ge v0, v5, :cond_5 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->f:I */
/* const v1, 0xacda0 */
/* if-ge v0, v1, :cond_5 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* const v1, 0xea600 */
/* if-le v0, v1, :cond_4 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
} // :cond_4
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* if-le v0, v3, :cond_0 */
/* iput v3, p0, Lnet/chobin/android/psdxylz/l;->g:I */
} // :cond_5
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->e:I */
/* if-le v0, v5, :cond_7 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->f:I */
/* const v1, 0xacda0 */
/* if-ge v0, v1, :cond_7 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* if-le v0, v4, :cond_6 */
/* iput v4, p0, Lnet/chobin/android/psdxylz/l;->g:I */
} // :cond_6
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* if-ge v0, v6, :cond_0 */
/* iput v6, p0, Lnet/chobin/android/psdxylz/l;->g:I */
} // :cond_7
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->e:I */
/* if-ge v0, v5, :cond_9 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->f:I */
/* const v1, 0xacda0 */
/* if-le v0, v1, :cond_9 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* const v1, 0x4e200 */
/* if-ge v0, v1, :cond_8 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* goto/16 :goto_0 */
} // :cond_8
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* const v1, 0x111700 */
/* if-ge v0, v1, :cond_0 */
/* const v0, 0x111700 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* goto/16 :goto_0 */
} // :cond_9
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* if-ge v0, v4, :cond_a */
/* iput v4, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* goto/16 :goto_0 */
} // :cond_a
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* const v1, 0xc3500 */
/* if-le v0, v1, :cond_0 */
/* const v0, 0xc3500 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* goto/16 :goto_0 */
/* :pswitch_2 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->f:I */
/* const v1, 0xacda0 */
/* if-ge v0, v1, :cond_c */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* if-ge v0, v3, :cond_b */
/* iput v3, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* goto/16 :goto_0 */
} // :cond_b
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* if-le v0, v6, :cond_0 */
/* iput v6, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* goto/16 :goto_0 */
} // :cond_c
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* const v1, 0xc3500 */
/* if-ge v0, v1, :cond_d */
/* const v0, 0xc3500 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* goto/16 :goto_0 */
} // :cond_d
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* const v1, 0x111700 */
/* if-le v0, v1, :cond_0 */
/* const v0, 0x111700 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* goto/16 :goto_0 */
/* :pswitch_3 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->h:I */
/* iget v1, p0, Lnet/chobin/android/psdxylz/l;->g:I */
v0 = net.chobin.android.psdxylz.app.s .d ( v0,v1,v2 );
/* const v1, -0x27100 */
/* if-ge v0, v1, :cond_e */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->h:I */
/* sub-int/2addr v0, v3 */
/* add-int/2addr v0, v2 */
/* rem-int/2addr v0, v2 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* goto/16 :goto_0 */
} // :cond_e
/* if-le v0, v3, :cond_0 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->h:I */
/* add-int/2addr v0, v3 */
/* rem-int/2addr v0, v2 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* goto/16 :goto_0 */
/* :pswitch_4 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->h:I */
/* iget v1, p0, Lnet/chobin/android/psdxylz/l;->g:I */
v0 = net.chobin.android.psdxylz.app.s .d ( v0,v1,v2 );
/* neg-int v1, v1 */
/* if-ge v0, v1, :cond_f */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->h:I */
/* sub-int/2addr v0, v1 */
/* add-int/2addr v0, v2 */
/* rem-int/2addr v0, v2 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* goto/16 :goto_0 */
} // :cond_f
/* if-le v0, v1, :cond_0 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->h:I */
/* add-int/2addr v0, v1 */
/* rem-int/2addr v0, v2 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->g:I */
/* goto/16 :goto_0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
} // .end packed-switch
} // .end method
public void f ( ) {
/* .locals 3 */
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->j:I */
v1 = net.chobin.android.psdxylz.l.a;
/* iget v2, p0, Lnet/chobin/android/psdxylz/l;->d:I */
/* aget v1, v1, v2 */
/* if-le v0, v1, :cond_0 */
v0 = net.chobin.android.psdxylz.l.a;
/* iget v1, p0, Lnet/chobin/android/psdxylz/l;->d:I */
/* aget v0, v0, v1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->j:I */
} // :cond_0
/* iget v0, p0, Lnet/chobin/android/psdxylz/l;->j:I */
v1 = net.chobin.android.psdxylz.l.b;
/* iget v2, p0, Lnet/chobin/android/psdxylz/l;->d:I */
/* aget v1, v1, v2 */
/* if-ge v0, v1, :cond_1 */
v0 = net.chobin.android.psdxylz.l.b;
/* iget v1, p0, Lnet/chobin/android/psdxylz/l;->d:I */
/* aget v0, v0, v1 */
/* iput v0, p0, Lnet/chobin/android/psdxylz/l;->j:I */
} // :cond_1
return;
} // .end method
