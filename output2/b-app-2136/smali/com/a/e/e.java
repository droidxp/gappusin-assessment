public class com.a.e.e {
	 /* # static fields */
	 public static Integer j;
	 public static Boolean s;
	 /* # instance fields */
	 public java.util.ArrayList a;
	 public Integer b;
	 public Integer c;
	 public com.a.c.d d;
	 public com.a.c.d e;
	 public com.a.c.d f;
	 public com.a.e.i g;
	 public com.a.c.d h;
	 public com.a.c.d i;
	 public Integer k;
	 public Integer l;
	 public Integer m;
	 public Integer n;
	 public Boolean o;
	 public Integer p;
	 android.graphics.Paint q;
	 com.a.a.a r;
	 public Boolean t;
	 public Integer u;
	 public java.lang.String v;
	 public Boolean w;
	 public java.lang.String x;
	 public Boolean y;
	 /* # direct methods */
	 static com.a.e.e ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.a.e.e.s = (v0!= 0);
		 return;
	 } // .end method
	 public com.a.e.e ( ) {
		 /* .locals 6 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/a/e/e;->k:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/a/e/e;->l:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/a/e/e;->m:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/a/e/e;->n:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/a/e/e;->o:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/a/e/e;->p:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/a/e/e;->t:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/a/e/e;->u:I */
		 final String v0 = "1"; // const-string v0, "1"
		 this.v = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/a/e/e;->w:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/a/e/e;->y:Z */
		 this.r = p1;
		 this.g = p2;
		 v0 = this.r;
		 v0 = this.y;
		 this.a = v0;
		 v0 = this.a;
		 int v1 = 0; // const/4 v1, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* iput v0, p0, Lcom/a/e/e;->b:I */
		 v0 = this.a;
		 int v1 = 0; // const/4 v1, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* iput v0, p0, Lcom/a/e/e;->c:I */
		 v0 = java.lang.System.out;
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "RecordData.data[RecordData.RECORD_ID_GOLDCOUNT]====="; // const-string v2, "RecordData.data[RecordData.RECORD_ID_GOLDCOUNT]====="
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 v2 = com.a.f.m.b;
		 /* const/16 v3, 0x14 */
		 /* aget v2, v2, v3 */
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 /* new-instance v0, Lcom/a/c/d; */
		 /* int-to-float v2, v1 */
		 v1 = this.a;
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
		 /* int-to-float v1, v1 */
		 com.a.a.a .a ( v1 );
		 v1 = 		 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
		 /* sub-float v1, v2, v1 */
		 /* const/high16 v2, 0x40000000 # 2.0f */
		 /* div-float/2addr v1, v2 */
		 /* div-int/lit8 v2, v2, 0x2 */
		 /* int-to-float v2, v2 */
		 v3 = this.a;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.util.ArrayList ) v3 ).get ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v3, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x40800000 # 4.0f */
		 v3 = 		 com.a.a.a .a ( v3,v4 );
		 v4 = this.a;
		 int v5 = 0; // const/4 v5, 0x0
		 (( java.util.ArrayList ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Landroid/graphics/Bitmap; */
		 /* const/high16 v5, 0x41000000 # 8.0f */
		 v4 = 		 com.a.a.a .c ( v4,v5 );
		 int v5 = 0; // const/4 v5, 0x0
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 this.d = v0;
		 /* new-instance v0, Lcom/a/c/d; */
		 /* int-to-float v2, v1 */
		 v1 = this.a;
		 int v3 = 2; // const/4 v3, 0x2
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
		 /* int-to-float v1, v1 */
		 com.a.a.a .a ( v1 );
		 v1 = 		 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
		 /* sub-float v1, v2, v1 */
		 /* const/high16 v2, 0x40000000 # 2.0f */
		 /* div-float/2addr v1, v2 */
		 /* div-int/lit8 v2, v2, 0x2 */
		 /* int-to-float v2, v2 */
		 /* const/high16 v3, 0x42a00000 # 80.0f */
		 com.a.a.a .b ( v3 );
		 v3 = 		 (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
		 /* add-float/2addr v2, v3 */
		 v3 = this.a;
		 int v4 = 1; // const/4 v4, 0x1
		 (( java.util.ArrayList ) v3 ).get ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v3, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x40800000 # 4.0f */
		 v3 = 		 com.a.a.a .a ( v3,v4 );
		 v4 = this.a;
		 int v5 = 1; // const/4 v5, 0x1
		 (( java.util.ArrayList ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Landroid/graphics/Bitmap; */
		 /* const/high16 v5, 0x41000000 # 8.0f */
		 v4 = 		 com.a.a.a .c ( v4,v5 );
		 int v5 = 2; // const/4 v5, 0x2
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 this.e = v0;
		 /* new-instance v0, Lcom/a/c/d; */
		 /* int-to-float v1, v1 */
		 v2 = this.r;
		 v2 = this.ah;
		 /* const/high16 v3, 0x41400000 # 12.0f */
		 v2 = 		 com.a.a.a .a ( v2,v3 );
		 /* sub-float/2addr v1, v2 */
		 /* int-to-float v3, v2 */
		 v2 = this.a;
		 int v4 = 1; // const/4 v4, 0x1
		 (( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x41000000 # 8.0f */
		 v2 = 		 com.a.a.a .c ( v2,v4 );
		 /* sub-float v2, v3, v2 */
		 v3 = this.r;
		 v3 = this.ah;
		 /* const/high16 v4, 0x41400000 # 12.0f */
		 v3 = 		 com.a.a.a .a ( v3,v4 );
		 v4 = this.r;
		 v4 = this.ah;
		 /* const/high16 v5, 0x41000000 # 8.0f */
		 v4 = 		 com.a.a.a .c ( v4,v5 );
		 int v5 = 3; // const/4 v5, 0x3
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 this.h = v0;
		 /* new-instance v0, Lcom/a/c/d; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* int-to-float v3, v2 */
		 v2 = this.a;
		 int v4 = 1; // const/4 v4, 0x1
		 (( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x41000000 # 8.0f */
		 v2 = 		 com.a.a.a .c ( v2,v4 );
		 /* sub-float v2, v3, v2 */
		 v3 = this.a;
		 int v4 = 1; // const/4 v4, 0x1
		 (( java.util.ArrayList ) v3 ).get ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v3, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x41400000 # 12.0f */
		 v3 = 		 com.a.a.a .a ( v3,v4 );
		 v4 = this.a;
		 int v5 = 1; // const/4 v5, 0x1
		 (( java.util.ArrayList ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Landroid/graphics/Bitmap; */
		 /* const/high16 v5, 0x41000000 # 8.0f */
		 v4 = 		 com.a.a.a .c ( v4,v5 );
		 int v5 = 4; // const/4 v5, 0x4
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 this.i = v0;
		 /* new-instance v0, Lcom/a/c/d; */
		 /* int-to-float v2, v1 */
		 v1 = this.a;
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 /* const/high16 v3, 0x40600000 # 3.5f */
		 v1 = 		 com.a.a.a .a ( v1,v3 );
		 /* sub-float v1, v2, v1 */
		 /* const/high16 v2, 0x40000000 # 2.0f */
		 /* div-float/2addr v1, v2 */
		 /* div-int/lit8 v2, v2, 0x2 */
		 /* int-to-float v2, v2 */
		 /* const/high16 v3, 0x43200000 # 160.0f */
		 com.a.a.a .b ( v3 );
		 v3 = 		 (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
		 /* add-float/2addr v2, v3 */
		 v3 = this.a;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.util.ArrayList ) v3 ).get ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v3, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x40800000 # 4.0f */
		 v3 = 		 com.a.a.a .a ( v3,v4 );
		 v4 = this.a;
		 int v5 = 0; // const/4 v5, 0x0
		 (( java.util.ArrayList ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Landroid/graphics/Bitmap; */
		 /* const/high16 v5, 0x41000000 # 8.0f */
		 v4 = 		 com.a.a.a .c ( v4,v5 );
		 int v5 = 5; // const/4 v5, 0x5
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 this.f = v0;
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.q = v0;
		 /* sget-boolean v0, Lcom/a/d/a;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.g;
			 v0 = this.t;
			 (( com.a.d.a ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/d/a;->a()V
		 } // :cond_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 3 */
		 int v2 = 1; // const/4 v2, 0x1
		 com.a.f.g .i ( );
		 final String v1 = "1"; // const-string v1, "1"
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iput-boolean v2, p0, Lcom/a/e/e;->w:Z */
			 v0 = com.a.f.g.b;
			 this.x = v0;
		 } // :goto_0
		 /* iput-boolean v2, p0, Lcom/a/e/e;->y:Z */
		 return;
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/a/e/e;->w:Z */
} // .end method
public void a ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
	 /* .locals 8 */
	 v0 = this.r;
	 v0 = this.z;
	 v1 = this.r;
	 v2 = this.r;
	 v2 = this.z;
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 0; // const/4 v4, 0x0
	 (( com.a.a.a ) v1 ).a ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Matrix;
	 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
	 int v1 = 1; // const/4 v1, 0x1
	 /* if-eq v0, v1, :cond_1 */
	 v0 = this.a;
	 int v1 = 0; // const/4 v1, 0x0
	 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* move-object v7, v0 */
	 /* check-cast v7, Landroid/graphics/Bitmap; */
	 v0 = this.a;
	 int v1 = 0; // const/4 v1, 0x0
	 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* int-to-float v2, v1 */
	 v1 = this.a;
	 int v3 = 0; // const/4 v3, 0x0
	 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v1, Landroid/graphics/Bitmap; */
	 /* const/high16 v3, 0x40600000 # 3.5f */
	 v1 = 	 com.a.a.a .a ( v1,v3 );
	 /* sub-float v1, v2, v1 */
	 /* const/high16 v2, 0x40000000 # 2.0f */
	 /* div-float/2addr v1, v2 */
	 /* div-int/lit8 v2, v2, 0x2 */
	 /* int-to-float v2, v2 */
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 0; // const/4 v4, 0x0
	 /* const/high16 v5, 0x40600000 # 3.5f */
	 /* const/high16 v6, 0x41000000 # 8.0f */
	 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
	 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :goto_0
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_2 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* int-to-float v2, v1 */
v1 = this.a;
int v3 = 1; // const/4 v3, 0x1
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40600000 # 3.5f */
v1 = com.a.a.a .a ( v1,v3 );
/* sub-float v1, v2, v1 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* const/high16 v3, 0x42a00000 # 80.0f */
com.a.a.a .b ( v3 );
v3 = (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40600000 # 3.5f */
/* const/high16 v6, 0x41000000 # 8.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :goto_1
/* iget-boolean v0, p0, Lcom/a/e/e;->w:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 5; // const/4 v1, 0x5
/* if-eq v0, v1, :cond_3 */
v0 = this.a;
int v1 = 3; // const/4 v1, 0x3
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* int-to-float v2, v1 */
v1 = this.a;
int v3 = 0; // const/4 v3, 0x0
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40600000 # 3.5f */
v1 = com.a.a.a .a ( v1,v3 );
/* sub-float v1, v2, v1 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* const/high16 v3, 0x43200000 # 160.0f */
com.a.a.a .b ( v3 );
v3 = (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40600000 # 3.5f */
/* const/high16 v6, 0x41000000 # 8.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_0
} // :goto_2
int v1 = 3; // const/4 v1, 0x3
/* if-eq v0, v1, :cond_4 */
v0 = this.r;
v7 = this.ah;
v0 = this.r;
v0 = this.ah;
/* int-to-float v1, v1 */
v2 = this.r;
v2 = this.ah;
/* const/high16 v3, 0x41400000 # 12.0f */
v2 = com.a.a.a .a ( v2,v3 );
/* sub-float/2addr v1, v2 */
/* int-to-float v3, v2 */
v2 = this.a;
int v4 = 1; // const/4 v4, 0x1
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x41000000 # 8.0f */
v2 = com.a.a.a .c ( v2,v4 );
/* sub-float v2, v3, v2 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41400000 # 12.0f */
/* const/high16 v6, 0x41000000 # 8.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :goto_3
int v1 = 4; // const/4 v1, 0x4
/* if-eq v0, v1, :cond_5 */
v0 = this.a;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
int v1 = 0; // const/4 v1, 0x0
/* int-to-float v3, v2 */
v2 = this.a;
int v4 = 2; // const/4 v4, 0x2
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x41000000 # 8.0f */
v2 = com.a.a.a .c ( v2,v4 );
/* sub-float v2, v3, v2 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41400000 # 12.0f */
/* const/high16 v6, 0x41000000 # 8.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :goto_4
return;
} // :cond_1
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* int-to-float v2, v1 */
v1 = this.a;
int v3 = 0; // const/4 v3, 0x0
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const v3, 0x406ccccd # 3.7f */
v1 = com.a.a.a .a ( v1,v3 );
/* sub-float v1, v2, v1 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* const/high16 v3, 0x41200000 # 10.0f */
com.a.a.a .b ( v3 );
v3 = (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const v5, 0x406ccccd # 3.7f */
/* const/high16 v6, 0x41100000 # 9.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
/* goto/16 :goto_0 */
} // :cond_2
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* int-to-float v2, v1 */
v1 = this.a;
int v3 = 1; // const/4 v3, 0x1
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const v3, 0x406ccccd # 3.7f */
v1 = com.a.a.a .a ( v1,v3 );
/* sub-float v1, v2, v1 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* const/high16 v3, 0x42b40000 # 90.0f */
com.a.a.a .b ( v3 );
v3 = (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const v5, 0x406ccccd # 3.7f */
/* const/high16 v6, 0x41100000 # 9.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
/* goto/16 :goto_1 */
} // :cond_3
v0 = this.a;
int v1 = 3; // const/4 v1, 0x3
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* int-to-float v2, v1 */
v1 = this.a;
int v3 = 0; // const/4 v3, 0x0
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40600000 # 3.5f */
v1 = com.a.a.a .a ( v1,v3 );
/* sub-float v1, v2, v1 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* const/high16 v3, 0x43250000 # 165.0f */
com.a.a.a .b ( v3 );
v3 = (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const v5, 0x406ccccd # 3.7f */
/* const/high16 v6, 0x41000000 # 8.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
/* goto/16 :goto_2 */
} // :cond_4
v0 = this.r;
v7 = this.ah;
v0 = this.r;
v0 = this.ah;
/* int-to-float v1, v1 */
v2 = this.r;
v2 = this.ah;
/* const/high16 v3, 0x41500000 # 13.0f */
v2 = com.a.a.a .a ( v2,v3 );
/* sub-float/2addr v1, v2 */
/* int-to-float v3, v2 */
v2 = this.a;
int v4 = 1; // const/4 v4, 0x1
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x41100000 # 9.0f */
v2 = com.a.a.a .c ( v2,v4 );
/* sub-float v2, v3, v2 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41500000 # 13.0f */
/* const/high16 v6, 0x41100000 # 9.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
/* goto/16 :goto_3 */
} // :cond_5
v0 = this.a;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v1, 0x40a00000 # 5.0f */
/* int-to-float v3, v2 */
v2 = this.a;
int v4 = 2; // const/4 v4, 0x2
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x41100000 # 9.0f */
v2 = com.a.a.a .c ( v2,v4 );
/* sub-float v2, v3, v2 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41500000 # 13.0f */
/* const/high16 v6, 0x41100000 # 9.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
/* goto/16 :goto_4 */
} // .end method
