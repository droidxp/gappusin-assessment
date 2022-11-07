public class com.a.e.b {
	 /* # static fields */
	 public static Integer f;
	 public static android.graphics.Paint g;
	 public static android.graphics.Paint h;
	 public static Integer i;
	 static java.lang.String m;
	 /* # instance fields */
	 com.a.a.a a;
	 public com.a.c.d b;
	 public com.a.c.d c;
	 public com.a.c.d d;
	 public com.a.c.d e;
	 public com.a.c.d j;
	 public com.a.c.d k;
	 public java.util.ArrayList l;
	 java.lang.String n;
	 /* # direct methods */
	 static com.a.e.b ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [Ljava/lang/String; */
		 final String v1 = "\u4ec5\u97002\u5143\u7acb\u523b\u62e5\u67092000\u91d1\u5e01\uff01 "; // const-string v1, "\u4ec5\u97002\u5143\u7acb\u523b\u62e5\u67092000\u91d1\u5e01\uff01 "
		 /* aput-object v1, v0, v2 */
		 int v1 = 1; // const/4 v1, 0x1
		 final String v2 = "\u4ec5\u97004\u5143\u7acb\u523b\u62e5\u67096000\u91d1\u5e01"; // const-string v2, "\u4ec5\u97004\u5143\u7acb\u523b\u62e5\u67096000\u91d1\u5e01"
		 /* aput-object v2, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 final String v2 = "\u4ec5\u97006\u5143\u7acb\u523b\u62e5\u670920000\u91d1\u5e01\uff01"; // const-string v2, "\u4ec5\u97006\u5143\u7acb\u523b\u62e5\u670920000\u91d1\u5e01\uff01"
		 /* aput-object v2, v0, v1 */
		 int v1 = 3; // const/4 v1, 0x3
		 final String v2 = ""; // const-string v2, ""
		 /* aput-object v2, v0, v1 */
		 return;
	 } // .end method
	 public com.a.e.b ( ) {
		 /* .locals 12 */
		 int v9 = 2; // const/4 v9, 0x2
		 /* const/high16 v7, 0x40c00000 # 6.0f */
		 /* const/high16 v11, 0x3fc00000 # 1.5f */
		 /* const/high16 v6, 0x40800000 # 4.0f */
		 int v8 = 0; // const/4 v8, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [Ljava/lang/String; */
		 final String v1 = "\u8d2d\u4e70\u91d1\u5e01"; // const-string v1, "\u8d2d\u4e70\u91d1\u5e01"
		 /* aput-object v1, v0, v8 */
		 int v1 = 1; // const/4 v1, 0x1
		 final String v2 = "\u8d2d\u4e70\u91d1\u5e01"; // const-string v2, "\u8d2d\u4e70\u91d1\u5e01"
		 /* aput-object v2, v0, v1 */
		 final String v1 = "\u8d2d\u4e70\u91d1\u5e01"; // const-string v1, "\u8d2d\u4e70\u91d1\u5e01"
		 /* aput-object v1, v0, v9 */
		 int v1 = 3; // const/4 v1, 0x3
		 final String v2 = "\u8d2d\u4e70\u91d1\u5e01"; // const-string v2, "\u8d2d\u4e70\u91d1\u5e01"
		 /* aput-object v2, v0, v1 */
		 this.n = v0;
		 this.a = p1;
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 v0 = com.a.e.b.g;
		 /* int-to-float v1, v1 */
		 /* const/high16 v2, 0x41a00000 # 20.0f */
		 /* div-float/2addr v1, v2 */
		 (( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
		 v0 = com.a.e.b.g;
		 int v1 = -1; // const/4 v1, -0x1
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 v0 = com.a.e.b.h;
		 /* int-to-float v1, v1 */
		 /* const/high16 v2, 0x41f00000 # 30.0f */
		 /* div-float/2addr v1, v2 */
		 (( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
		 v0 = com.a.e.b.h;
		 int v1 = -1; // const/4 v1, -0x1
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 /* new-instance v0, Lcom/a/c/d; */
		 /* const/high16 v1, 0x41200000 # 10.0f */
		 com.a.a.a .a ( v1 );
		 v1 = 		 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
		 /* const/high16 v2, 0x41f00000 # 30.0f */
		 com.a.a.a .b ( v2 );
		 v2 = 		 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
		 v3 = this.a;
		 v3 = this.J;
		 /* const/high16 v4, 0x40e00000 # 7.0f */
		 v3 = 		 com.a.a.a .a ( v3,v4 );
		 v4 = this.a;
		 v4 = this.J;
		 /* const/high16 v5, 0x40e00000 # 7.0f */
		 v4 = 		 com.a.a.a .b ( v4,v5 );
		 int v5 = 1; // const/4 v5, 0x1
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 this.b = v0;
		 /* new-instance v0, Lcom/a/c/d; */
		 /* div-int/lit8 v1, v1, 0xc */
		 /* int-to-float v2, v1 */
		 v1 = this.a;
		 v1 = this.aG;
		 (( java.util.ArrayList ) v1 ).get ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v6 );
		 /* div-float/2addr v1, v7 */
		 /* add-float/2addr v1, v2 */
		 /* div-int/lit8 v2, v2, 0x4 */
		 /* int-to-float v3, v2 */
		 v2 = this.a;
		 v2 = this.aG;
		 (( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v6 );
		 /* const/high16 v4, 0x41400000 # 12.0f */
		 /* div-float/2addr v2, v4 */
		 /* const v4, 0x41033333 # 8.2f */
		 /* mul-float/2addr v2, v4 */
		 /* add-float/2addr v2, v3 */
		 v3 = this.a;
		 v3 = this.aG;
		 (( java.util.ArrayList ) v3 ).get ( v9 ); // invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v3, Landroid/graphics/Bitmap; */
		 v3 = 		 com.a.a.a .a ( v3,v7 );
		 v4 = this.a;
		 v4 = this.aG;
		 (( java.util.ArrayList ) v4 ).get ( v9 ); // invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Landroid/graphics/Bitmap; */
		 v4 = 		 com.a.a.a .b ( v4,v7 );
		 /* move v5, v9 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 this.c = v0;
		 /* new-instance v0, Lcom/a/c/d; */
		 /* div-int/lit8 v1, v1, 0xc */
		 /* int-to-float v1, v1 */
		 /* const/high16 v2, 0x40200000 # 2.5f */
		 /* mul-float/2addr v2, v1 */
		 v1 = this.a;
		 v1 = this.aG;
		 (( java.util.ArrayList ) v1 ).get ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v6 );
		 /* div-float/2addr v1, v7 */
		 /* add-float/2addr v1, v2 */
		 /* div-int/lit8 v2, v2, 0x4 */
		 /* int-to-float v3, v2 */
		 v2 = this.a;
		 v2 = this.aG;
		 (( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v6 );
		 /* const/high16 v4, 0x41400000 # 12.0f */
		 /* div-float/2addr v2, v4 */
		 /* const v4, 0x41033333 # 8.2f */
		 /* mul-float/2addr v2, v4 */
		 /* add-float/2addr v2, v3 */
		 v3 = this.a;
		 v3 = this.aG;
		 (( java.util.ArrayList ) v3 ).get ( v9 ); // invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v3, Landroid/graphics/Bitmap; */
		 v3 = 		 com.a.a.a .a ( v3,v7 );
		 v4 = this.a;
		 v4 = this.aG;
		 (( java.util.ArrayList ) v4 ).get ( v9 ); // invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Landroid/graphics/Bitmap; */
		 v4 = 		 com.a.a.a .b ( v4,v7 );
		 int v5 = 3; // const/4 v5, 0x3
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 this.d = v0;
		 /* new-instance v0, Lcom/a/c/d; */
		 /* div-int/lit8 v1, v1, 0xc */
		 /* int-to-float v1, v1 */
		 /* const/high16 v2, 0x40d00000 # 6.5f */
		 /* mul-float/2addr v2, v1 */
		 v1 = this.a;
		 v1 = this.aG;
		 (( java.util.ArrayList ) v1 ).get ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v6 );
		 /* div-float/2addr v1, v7 */
		 /* add-float/2addr v1, v2 */
		 /* div-int/lit8 v2, v2, 0x4 */
		 /* int-to-float v3, v2 */
		 v2 = this.a;
		 v2 = this.aG;
		 (( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v6 );
		 /* const/high16 v4, 0x41400000 # 12.0f */
		 /* div-float/2addr v2, v4 */
		 /* const v4, 0x41033333 # 8.2f */
		 /* mul-float/2addr v2, v4 */
		 /* add-float/2addr v2, v3 */
		 v3 = this.a;
		 v3 = this.aG;
		 (( java.util.ArrayList ) v3 ).get ( v9 ); // invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v3, Landroid/graphics/Bitmap; */
		 v3 = 		 com.a.a.a .a ( v3,v7 );
		 v4 = this.a;
		 v4 = this.aG;
		 (( java.util.ArrayList ) v4 ).get ( v9 ); // invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Landroid/graphics/Bitmap; */
		 v4 = 		 com.a.a.a .b ( v4,v7 );
		 int v5 = 4; // const/4 v5, 0x4
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 this.e = v0;
		 /* new-instance v0, Lcom/a/c/d; */
		 /* int-to-float v2, v1 */
		 v1 = this.a;
		 v1 = this.ac;
		 (( java.util.ArrayList ) v1 ).get ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v11 );
		 /* sub-float v1, v2, v1 */
		 /* const/high16 v2, 0x40000000 # 2.0f */
		 /* div-float v2, v1, v2 */
		 v1 = this.a;
		 v1 = this.ac;
		 (( java.util.ArrayList ) v1 ).get ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v11 );
		 /* const/high16 v3, 0x41700000 # 15.0f */
		 /* div-float/2addr v1, v3 */
		 /* add-float/2addr v1, v2 */
		 /* int-to-float v3, v2 */
		 v2 = this.a;
		 v2 = this.ac;
		 (( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v11 );
		 /* const/high16 v4, 0x40000000 # 2.0f */
		 /* div-float/2addr v2, v4 */
		 /* add-float/2addr v2, v3 */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* div-float v3, v2, v3 */
		 v2 = this.a;
		 v2 = this.ac;
		 (( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v11 );
		 /* const/high16 v4, 0x41a00000 # 20.0f */
		 /* div-float/2addr v2, v4 */
		 /* sub-float v2, v3, v2 */
		 v3 = this.a;
		 v3 = this.ac;
		 int v4 = 1; // const/4 v4, 0x1
		 (( java.util.ArrayList ) v3 ).get ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v3, Landroid/graphics/Bitmap; */
		 v3 = 		 com.a.a.a .a ( v3,v6 );
		 v4 = this.a;
		 v4 = this.ac;
		 int v5 = 1; // const/4 v5, 0x1
		 (( java.util.ArrayList ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Landroid/graphics/Bitmap; */
		 v4 = 		 com.a.a.a .b ( v4,v6 );
		 /* const/16 v5, 0x12 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 this.j = v0;
		 /* new-instance v0, Lcom/a/c/d; */
		 /* int-to-float v2, v1 */
		 v1 = this.a;
		 v1 = this.ac;
		 (( java.util.ArrayList ) v1 ).get ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v11 );
		 /* add-float/2addr v1, v2 */
		 /* const/high16 v2, 0x40000000 # 2.0f */
		 /* div-float v2, v1, v2 */
		 v1 = this.a;
		 v1 = this.ac;
		 (( java.util.ArrayList ) v1 ).get ( v9 ); // invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v6 );
		 /* sub-float/2addr v2, v1 */
		 v1 = this.a;
		 v1 = this.ac;
		 (( java.util.ArrayList ) v1 ).get ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v11 );
		 /* const/high16 v3, 0x41700000 # 15.0f */
		 /* div-float/2addr v1, v3 */
		 /* sub-float v1, v2, v1 */
		 /* int-to-float v3, v2 */
		 v2 = this.a;
		 v2 = this.ac;
		 (( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v11 );
		 /* const/high16 v4, 0x40000000 # 2.0f */
		 /* div-float/2addr v2, v4 */
		 /* add-float/2addr v2, v3 */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* div-float v3, v2, v3 */
		 v2 = this.a;
		 v2 = this.ac;
		 (( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v11 );
		 /* const/high16 v4, 0x41a00000 # 20.0f */
		 /* div-float/2addr v2, v4 */
		 /* sub-float v2, v3, v2 */
		 v3 = this.a;
		 v3 = this.ac;
		 int v4 = 1; // const/4 v4, 0x1
		 (( java.util.ArrayList ) v3 ).get ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v3, Landroid/graphics/Bitmap; */
		 v3 = 		 com.a.a.a .a ( v3,v6 );
		 v4 = this.a;
		 v4 = this.ac;
		 int v5 = 1; // const/4 v5, 0x1
		 (( java.util.ArrayList ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Landroid/graphics/Bitmap; */
		 v4 = 		 com.a.a.a .b ( v4,v6 );
		 /* const/16 v5, 0x13 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 this.k = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.l = v0;
		 /* move v7, v8 */
	 } // :goto_0
	 int v0 = 4; // const/4 v0, 0x4
	 /* if-lt v7, v0, :cond_0 */
	 return;
} // :cond_0
v9 = this.l;
/* new-instance v0, Lcom/a/c/o; */
v1 = com.a.e.b.m;
/* aget-object v1, v1, v7 */
/* int-to-float v3, v2 */
v2 = this.a;
v2 = this.ac;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .a ( v2,v11 );
/* sub-float v2, v3, v2 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float v3, v2, v3 */
v2 = this.a;
v2 = this.ac;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0xa */
/* int-to-float v2, v2 */
/* add-float/2addr v2, v3 */
/* div-int/lit8 v4, v3, 0x2 */
v3 = this.a;
v3 = this.ac;
(( java.util.ArrayList ) v3 ).get ( v8 ); // invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Landroid/graphics/Bitmap; */
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v3, v3, 0x8 */
/* sub-int v3, v4, v3 */
/* int-to-float v3, v3 */
v4 = this.a;
v4 = this.ac;
(( java.util.ArrayList ) v4 ).get ( v8 ); // invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroid/graphics/Bitmap; */
v5 = (( android.graphics.Bitmap ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I
v4 = this.a;
v4 = this.ac;
(( java.util.ArrayList ) v4 ).get ( v8 ); // invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroid/graphics/Bitmap; */
v4 = (( android.graphics.Bitmap ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v4, v4, 0x1e */
/* sub-int v4, v5, v4 */
/* int-to-float v4, v4 */
v5 = this.a;
v5 = this.ac;
(( java.util.ArrayList ) v5 ).get ( v8 ); // invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroid/graphics/Bitmap; */
v5 = (( android.graphics.Bitmap ) v5 ).getHeight ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v5, v5, 0x2 */
/* int-to-float v5, v5 */
/* int-to-float v6, v6 */
/* const/high16 v10, 0x41f00000 # 30.0f */
/* div-float/2addr v6, v10 */
/* invoke-direct/range {v0 ..v6}, Lcom/a/c/o;-><init>(Ljava/lang/String;FFFFF)V */
(( java.util.ArrayList ) v9 ).add ( v0 ); // invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v0, v7, 0x1 */
/* move v7, v0 */
/* goto/16 :goto_0 */
} // .end method
/* # virtual methods */
public void a ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 8 */
v0 = this.a;
v0 = this.aH;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.aH;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x3f800000 # 1.0f */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.aH;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.aH;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x3f800000 # 1.0f */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.aH;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.aH;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
int v1 = 0; // const/4 v1, 0x0
/* int-to-float v2, v2 */
/* const/high16 v3, 0x41a00000 # 20.0f */
/* div-float/2addr v2, v3 */
/* const v3, 0x40666666 # 3.6f */
/* mul-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x3f800000 # 1.0f */
/* const/high16 v6, 0x3fc00000 # 1.5f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.aH;
int v1 = 3; // const/4 v1, 0x3
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.aH;
int v1 = 3; // const/4 v1, 0x3
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
int v1 = 0; // const/4 v1, 0x0
/* int-to-float v3, v2 */
v2 = this.a;
v2 = this.aH;
int v4 = 3; // const/4 v4, 0x3
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x3f800000 # 1.0f */
v2 = com.a.a.a .b ( v2,v4 );
/* sub-float v2, v3, v2 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x3f800000 # 1.0f */
/* const/high16 v6, 0x41380000 # 11.5f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.aG;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.aG;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* int-to-float v2, v1 */
v1 = this.a;
v1 = this.aG;
int v3 = 1; // const/4 v3, 0x1
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40a00000 # 5.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* sub-float v1, v2, v1 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
/* div-int/lit8 v2, v2, 0x32 */
/* int-to-float v2, v2 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.aG;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.aG;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* div-int/lit8 v1, v1, 0xc */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x40200000 # 2.5f */
/* mul-float/2addr v1, v2 */
/* div-int/lit8 v2, v2, 0x4 */
/* int-to-float v2, v2 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40800000 # 4.0f */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.aG;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.aG;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* div-int/lit8 v1, v1, 0xc */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x40d00000 # 6.5f */
/* mul-float/2addr v1, v2 */
/* div-int/lit8 v2, v2, 0x4 */
/* int-to-float v2, v2 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40800000 # 4.0f */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.aG;
int v1 = 4; // const/4 v1, 0x4
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.aG;
int v1 = 4; // const/4 v1, 0x4
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* div-int/lit8 v1, v1, 0xc */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x40200000 # 2.5f */
/* mul-float/2addr v2, v1 */
v1 = this.a;
v1 = this.aG;
int v3 = 0; // const/4 v3, 0x0
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40800000 # 4.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* const/high16 v3, 0x40e00000 # 7.0f */
/* div-float/2addr v1, v3 */
/* add-float/2addr v1, v2 */
/* div-int/lit8 v2, v2, 0x4 */
/* int-to-float v3, v2 */
v2 = this.a;
v2 = this.aG;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40800000 # 4.0f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x41400000 # 12.0f */
/* div-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.aG;
int v1 = 5; // const/4 v1, 0x5
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.aG;
int v1 = 5; // const/4 v1, 0x5
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* div-int/lit8 v1, v1, 0xc */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x40d00000 # 6.5f */
/* mul-float/2addr v2, v1 */
v1 = this.a;
v1 = this.aG;
int v3 = 0; // const/4 v3, 0x0
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40800000 # 4.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* const/high16 v3, 0x40e00000 # 7.0f */
/* div-float/2addr v1, v3 */
/* add-float/2addr v1, v2 */
/* div-int/lit8 v2, v2, 0x4 */
/* int-to-float v3, v2 */
v2 = this.a;
v2 = this.aG;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40800000 # 4.0f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x41400000 # 12.0f */
/* div-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.aG;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.aG;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* div-int/lit8 v1, v1, 0xc */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x40200000 # 2.5f */
/* mul-float/2addr v2, v1 */
v1 = this.a;
v1 = this.aG;
int v3 = 0; // const/4 v3, 0x0
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40800000 # 4.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* const/high16 v3, 0x40c00000 # 6.0f */
/* div-float/2addr v1, v3 */
/* add-float/2addr v1, v2 */
/* div-int/lit8 v2, v2, 0x4 */
/* int-to-float v3, v2 */
v2 = this.a;
v2 = this.aG;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40800000 # 4.0f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x41400000 # 12.0f */
/* div-float/2addr v2, v4 */
/* const v4, 0x41033333 # 8.2f */
/* mul-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40c00000 # 6.0f */
/* const/high16 v6, 0x40c00000 # 6.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.aG;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.aG;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* div-int/lit8 v1, v1, 0xc */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x40d00000 # 6.5f */
/* mul-float/2addr v2, v1 */
v1 = this.a;
v1 = this.aG;
int v3 = 0; // const/4 v3, 0x0
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40800000 # 4.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* const/high16 v3, 0x40c00000 # 6.0f */
/* div-float/2addr v1, v3 */
/* add-float/2addr v1, v2 */
/* div-int/lit8 v2, v2, 0x4 */
/* int-to-float v3, v2 */
v2 = this.a;
v2 = this.aG;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40800000 # 4.0f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x41400000 # 12.0f */
/* div-float/2addr v2, v4 */
/* const v4, 0x41033333 # 8.2f */
/* mul-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40c00000 # 6.0f */
/* const/high16 v6, 0x40c00000 # 6.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v7 = this.J;
v0 = this.a;
v0 = this.J;
/* const/high16 v1, 0x41200000 # 10.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x41f00000 # 30.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40e00000 # 7.0f */
/* const/high16 v6, 0x41000000 # 8.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v7 = this.T;
v0 = this.a;
v0 = this.T;
/* const/high16 v1, 0x441b0000 # 620.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x41f00000 # 30.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41a00000 # 20.0f */
/* const/high16 v6, 0x41200000 # 10.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.ax;
int v1 = 3; // const/4 v1, 0x3
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const v3, 0x441ec000 # 635.0f */
/* const/high16 v4, 0x42180000 # 38.0f */
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x41a00000 # 20.0f */
/* int-to-float v7, v1 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* invoke-static/range {v0 ..v7}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFF)V */
return;
} // .end method
public void a ( android.graphics.Canvas p0, android.graphics.Paint p1, Integer p2 ) {
/* .locals 8 */
v0 = this.a;
v0 = this.ac;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.ac;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* int-to-float v2, v1 */
v1 = this.a;
v1 = this.ac;
int v3 = 0; // const/4 v3, 0x0
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x3fc00000 # 1.5f */
v1 = com.a.a.a .a ( v1,v3 );
/* sub-float v1, v2, v1 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
/* int-to-float v3, v2 */
v2 = this.a;
v2 = this.ac;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x3fc00000 # 1.5f */
v2 = com.a.a.a .b ( v2,v4 );
/* sub-float v2, v3, v2 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x3fc00000 # 1.5f */
/* const/high16 v6, 0x3fc00000 # 1.5f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.n;
/* add-int/lit8 v1, p3, -0x1 */
/* aget-object v1, v0, v1 */
/* div-int/lit8 v0, v0, 0x2 */
/* int-to-float v0, v0 */
/* int-to-float v2, v2 */
/* const/high16 v3, 0x41a00000 # 20.0f */
/* div-float/2addr v2, v3 */
v3 = this.n;
/* add-int/lit8 v4, p3, -0x1 */
/* aget-object v3, v3, v4 */
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* mul-float/2addr v2, v3 */
/* sub-float v2, v0, v2 */
/* int-to-float v3, v0 */
v0 = this.a;
v0 = this.ac;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x3fc00000 # 1.5f */
v0 = com.a.a.a .b ( v0,v4 );
/* const/high16 v4, 0x41200000 # 10.0f */
/* div-float/2addr v0, v4 */
/* const/high16 v4, 0x40a00000 # 5.0f */
/* mul-float/2addr v0, v4 */
/* sub-float v0, v3, v0 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v0, v3 */
v3 = com.a.e.b.g;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v0, v3 ); // invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
v0 = com.a.e.b.m;
/* add-int/lit8 v1, p3, -0x1 */
/* aget-object v1, v0, v1 */
/* div-int/lit8 v0, v0, 0x2 */
/* int-to-float v0, v0 */
/* int-to-float v2, v2 */
/* const/high16 v3, 0x420c0000 # 35.0f */
/* div-float/2addr v2, v3 */
v3 = com.a.e.b.m;
/* add-int/lit8 v4, p3, -0x1 */
/* aget-object v3, v3, v4 */
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
/* mul-float/2addr v2, v3 */
/* sub-float v2, v0, v2 */
/* int-to-float v3, v0 */
v0 = this.a;
v0 = this.ac;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x3fc00000 # 1.5f */
v0 = com.a.a.a .b ( v0,v4 );
/* const/high16 v4, 0x41200000 # 10.0f */
/* div-float/2addr v0, v4 */
/* sub-float v0, v3, v0 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v0, v3 */
v3 = com.a.e.b.h;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v0, v3 ); // invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
v0 = this.a;
v0 = this.ac;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.ac;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* int-to-float v2, v1 */
v1 = this.a;
v1 = this.ac;
int v3 = 0; // const/4 v3, 0x0
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x3fc00000 # 1.5f */
v1 = com.a.a.a .a ( v1,v3 );
/* sub-float v1, v2, v1 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float v2, v1, v2 */
v1 = this.a;
v1 = this.ac;
int v3 = 0; // const/4 v3, 0x0
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x3fc00000 # 1.5f */
v1 = com.a.a.a .a ( v1,v3 );
/* const/high16 v3, 0x41700000 # 15.0f */
/* div-float/2addr v1, v3 */
/* add-float/2addr v1, v2 */
/* int-to-float v3, v2 */
v2 = this.a;
v2 = this.ac;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x3fc00000 # 1.5f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float v3, v2, v3 */
v2 = this.a;
v2 = this.ac;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x3fc00000 # 1.5f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x41a00000 # 20.0f */
/* div-float/2addr v2, v4 */
/* sub-float v2, v3, v2 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40800000 # 4.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.ac;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.ac;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* int-to-float v2, v1 */
v1 = this.a;
v1 = this.ac;
int v3 = 0; // const/4 v3, 0x0
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x3fc00000 # 1.5f */
v1 = com.a.a.a .a ( v1,v3 );
/* add-float/2addr v1, v2 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float v2, v1, v2 */
v1 = this.a;
v1 = this.ac;
int v3 = 2; // const/4 v3, 0x2
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40800000 # 4.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* sub-float/2addr v2, v1 */
v1 = this.a;
v1 = this.ac;
int v3 = 0; // const/4 v3, 0x0
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x3fc00000 # 1.5f */
v1 = com.a.a.a .a ( v1,v3 );
/* const/high16 v3, 0x41700000 # 15.0f */
/* div-float/2addr v1, v3 */
/* sub-float v1, v2, v1 */
/* int-to-float v3, v2 */
v2 = this.a;
v2 = this.ac;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x3fc00000 # 1.5f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float v3, v2, v3 */
v2 = this.a;
v2 = this.ac;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x3fc00000 # 1.5f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x41a00000 # 20.0f */
/* div-float/2addr v2, v4 */
/* sub-float v2, v3, v2 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40800000 # 4.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
return;
} // .end method
