public class com.doodlemobile.basket.graphics.DTileAnimation extends com.doodlemobile.basket.graphics.TileAnimation {
	 /* # static fields */
	 public static Boolean g;
	 private static n;
	 private static o;
	 private static I p;
	 private static I q;
	 private static r;
	 private static s;
	 /* # instance fields */
	 h;
	 I i;
	 I j;
	 k;
	 private l;
	 private Float m;
	 /* # direct methods */
	 static com.doodlemobile.basket.graphics.DTileAnimation ( ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x20 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.doodlemobile.basket.graphics.DTileAnimation.g = (v0!= 0);
		 /* new-array v0, v1, [I */
		 /* new-array v0, v1, [I */
		 /* new-array v0, v1, [[I */
		 /* new-array v0, v1, [[I */
		 /* new-array v0, v1, [I */
		 /* new-array v0, v1, [I */
		 return;
	 } // .end method
	 public com.doodlemobile.basket.graphics.DTileAnimation ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/graphics/TileAnimation;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 int v0 = 0; // const/4 v0, 0x0
		 final String v1 = "scale"; // const-string v1, "scale"
		 v0 = 		 /* const/high16 v2, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->m:F */
		 /* iget v0, p0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->d:I */
		 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->e:I */
		 /* mul-int/2addr v0, v1 */
		 /* mul-int/lit8 v0, v0, 0x8 */
		 /* new-array v0, v0, [F */
		 this.l = v0;
		 v0 = this.l;
		 /* const/high16 v1, -0x40800000 # -1.0f */
		 java.util.Arrays .fill ( v0,v1 );
		 return;
	 } // .end method
	 private static void a ( org.xmlpull.v1.XmlPullParser p0 ) {
		 v0 = 		 /* .locals 3 */
	 v1 = 	 } // :cond_0
	 int v2 = 3; // const/4 v2, 0x3
	 v2 = 	 /* if-ne v1, v2, :cond_1 */
	 /* if-le v2, v0, :cond_2 */
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_0 */
} // :cond_2
return;
} // .end method
/* # virtual methods */
public com.doodlemobile.basket.graphics.i a ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/doodlemobile/basket/graphics/g; */
/* invoke-direct {v0, p0}, Lcom/doodlemobile/basket/graphics/g;-><init>(Lcom/doodlemobile/basket/graphics/DTileAnimation;)V */
} // .end method
public final void a ( com.doodlemobile.basket.math.MatrixStack p0, Integer p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 18 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->f:J */
/* move-wide v3, v0 */
/* const-wide/16 v5, 0x0 */
/* cmp-long v3, v3, v5 */
/* if-nez v3, :cond_0 */
/* new-instance v3, Ljava/lang/RuntimeException; */
/* invoke-direct {v3}, Ljava/lang/RuntimeException;-><init>()V */
(( java.lang.RuntimeException ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/RuntimeException;->printStackTrace()V
} // :cond_0
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->f:J */
/* move-wide v3, v0 */
/* const-wide/16 v5, 0x0 */
/* cmp-long v3, v3, v5 */
/* if-nez v3, :cond_2 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->b:F */
/* move v3, v0 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
/* iget v4, v4, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* int-to-float v4, v4 */
/* div-float/2addr v3, v4 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->c:F */
/* move v4, v0 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
/* iget v5, v5, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* int-to-float v5, v5 */
/* div-float/2addr v4, v5 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->d:I */
/* move v5, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->e:I */
/* move v6, v0 */
com.doodlemobile.basket.graphics.DTileAnimation .createNativeObject ( v3,v4,v5,v6 );
/* move-result-wide v3 */
/* move-wide v0, v3 */
/* move-object/from16 v2, p0 */
/* iput-wide v0, v2, Lcom/doodlemobile/basket/graphics/DTileAnimation;->f:J */
/* const/high16 v3, 0x3f000000 # 0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
/* iget v4, v4, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* int-to-float v4, v4 */
/* div-float v10, v3, v4 */
/* const/high16 v3, 0x3f000000 # 0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
/* iget v4, v4, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* int-to-float v4, v4 */
/* div-float v11, v3, v4 */
int v3 = 0; // const/4 v3, 0x0
/* move v5, v3 */
} // :goto_0
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->d:I */
/* move v3, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->e:I */
/* move v4, v0 */
/* mul-int/2addr v3, v4 */
/* if-ge v5, v3, :cond_2 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v3, v0 */
/* mul-int/lit8 v4, v5, 0x8 */
/* aget v3, v3, v4 */
int v4 = 0; // const/4 v4, 0x0
/* cmpl-float v3, v3, v4 */
/* if-ltz v3, :cond_1 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v3, v0 */
/* mul-int/lit8 v4, v5, 0x8 */
/* aget v6, v3, v4 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v3, v0 */
/* mul-int/lit8 v4, v5, 0x8 */
/* add-int/lit8 v4, v4, 0x1 */
/* aget v7, v3, v4 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v3, v0 */
/* mul-int/lit8 v4, v5, 0x8 */
/* add-int/lit8 v4, v4, 0x2 */
/* aget v12, v3, v4 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v3, v0 */
/* mul-int/lit8 v4, v5, 0x8 */
/* add-int/lit8 v4, v4, 0x3 */
/* aget v13, v3, v4 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v3, v0 */
/* mul-int/lit8 v4, v5, 0x8 */
/* add-int/lit8 v4, v4, 0x4 */
/* aget v14, v3, v4 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v3, v0 */
/* mul-int/lit8 v4, v5, 0x8 */
/* add-int/lit8 v4, v4, 0x5 */
/* aget v15, v3, v4 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v3, v0 */
/* mul-int/lit8 v4, v5, 0x8 */
/* add-int/lit8 v4, v4, 0x6 */
/* aget v16, v3, v4 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v3, v0 */
/* mul-int/lit8 v4, v5, 0x8 */
/* add-int/lit8 v4, v4, 0x7 */
/* aget v17, v3, v4 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->f:J */
/* move-wide v3, v0 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v8, v0 */
/* iget v8, v8, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* int-to-float v8, v8 */
/* div-float/2addr v6, v8 */
/* add-float/2addr v6, v10 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v8, v0 */
/* iget v8, v8, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* int-to-float v8, v8 */
/* div-float/2addr v7, v8 */
/* add-float/2addr v7, v11 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v8, v0 */
/* iget v8, v8, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* int-to-float v8, v8 */
/* div-float v8, v12, v8 */
/* sub-float/2addr v8, v10 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v9, v0 */
/* iget v9, v9, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* int-to-float v9, v9 */
/* div-float v9, v13, v9 */
/* sub-float/2addr v9, v11 */
/* invoke-static/range {v3 ..v9}, Lcom/doodlemobile/basket/graphics/DTileAnimation;->setTileTexcoord(JIFFFF)V */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->f:J */
/* move-wide v3, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->m:F */
/* move v6, v0 */
/* mul-float/2addr v6, v14 */
/* mul-float v6, v6, v16 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->m:F */
/* move v7, v0 */
/* mul-float/2addr v7, v15 */
/* mul-float v7, v7, v17 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->m:F */
/* move v8, v0 */
/* mul-float/2addr v8, v12 */
/* mul-float v8, v8, v16 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->m:F */
/* move v9, v0 */
/* mul-float/2addr v9, v13 */
/* mul-float v9, v9, v17 */
/* invoke-static/range {v3 ..v9}, Lcom/doodlemobile/basket/graphics/DTileAnimation;->setTileVertices(JIFFFF)V */
} // :cond_1
/* add-int/lit8 v3, v5, 0x1 */
/* move v5, v3 */
/* goto/16 :goto_0 */
} // :cond_2
/* if-ltz p2, :cond_3 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->d:I */
/* move v3, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->e:I */
/* move v4, v0 */
/* mul-int/2addr v3, v4 */
/* move/from16 v0, p2 */
/* move v1, v3 */
/* if-ge v0, v1, :cond_3 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->f:J */
/* move-wide v3, v0 */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v7, v0 */
v7 = (( com.doodlemobile.basket.graphics.e ) v7 ).o ( ); // invoke-virtual {v7}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* mul-float v9, p3, p6 */
/* mul-float v10, p4, p6 */
/* mul-float v11, p5, p6 */
/* move/from16 v8, p2 */
/* move/from16 v12, p6 */
/* invoke-static/range {v3 ..v12}, Lcom/doodlemobile/basket/graphics/Animation;->callrender1(JJIIFFFF)V */
} // :cond_3
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
v0 = this.a;
v0 = (( com.doodlemobile.basket.graphics.e ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->a()Z
/* if-nez v0, :cond_0 */
v0 = this.a;
(( com.doodlemobile.basket.graphics.e ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/graphics/e;->a(Lcom/doodlemobile/basket/opengl/m;)V
} // :cond_0
return;
} // .end method
protected final void a ( org.xmlpull.v1.XmlPullParser p0, android.util.AttributeSet p1 ) {
/* .locals 24 */
v11 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
} // :cond_0
} // :goto_0
try { // :try_start_0
v4 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I */
int v5 = 3; // const/4 v5, 0x3
/* if-ne v4, v5, :cond_1 */
v5 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
/* if-le v5, v11, :cond_16 */
} // :cond_1
int v5 = 1; // const/4 v5, 0x1
/* if-eq v4, v5, :cond_16 */
int v5 = 2; // const/4 v5, 0x2
/* if-ne v4, v5, :cond_0 */
/* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String; */
final String v5 = "modules"; // const-string v5, "modules"
v5 = (( java.lang.String ) v5 ).compareToIgnoreCase ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I
/* if-nez v5, :cond_6 */
v12 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
int v4 = 0; // const/4 v4, 0x0
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v5, v0 */
/* const/high16 v6, -0x40800000 # -1.0f */
java.util.Arrays .fill ( v5,v6 );
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->f:J */
/* move-wide v5, v0 */
/* const-wide/16 v7, 0x0 */
/* cmp-long v5, v5, v7 */
/* if-nez v5, :cond_2 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->b:F */
/* move v5, v0 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v6, v0 */
/* iget v6, v6, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* int-to-float v6, v6 */
/* div-float/2addr v5, v6 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->c:F */
/* move v6, v0 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v7, v0 */
/* iget v7, v7, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* int-to-float v7, v7 */
/* div-float/2addr v6, v7 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->d:I */
/* move v7, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->e:I */
/* move v8, v0 */
com.doodlemobile.basket.graphics.DTileAnimation .createNativeObject ( v5,v6,v7,v8 );
/* move-result-wide v5 */
/* move-wide v0, v5 */
/* move-object/from16 v2, p0 */
/* iput-wide v0, v2, Lcom/doodlemobile/basket/graphics/DTileAnimation;->f:J */
} // :cond_2
/* const/high16 v5, 0x3f000000 # 0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v6, v0 */
/* iget v6, v6, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* int-to-float v6, v6 */
/* div-float v13, v5, v6 */
/* const/high16 v5, 0x3f000000 # 0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v6, v0 */
/* iget v6, v6, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* int-to-float v6, v6 */
/* div-float v14, v5, v6 */
/* move v15, v4 */
} // :cond_3
} // :goto_1
v4 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I */
int v5 = 3; // const/4 v5, 0x3
/* if-ne v4, v5, :cond_4 */
v5 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
/* if-le v5, v12, :cond_0 */
} // :cond_4
int v5 = 1; // const/4 v5, 0x1
/* if-eq v4, v5, :cond_0 */
int v5 = 2; // const/4 v5, 0x2
/* if-ne v4, v5, :cond_3 */
/* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String; */
final String v5 = "module"; // const-string v5, "module"
v4 = (( java.lang.String ) v5 ).compareToIgnoreCase ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I
/* if-nez v4, :cond_5 */
int v4 = 0; // const/4 v4, 0x0
final String v5 = "h"; // const-string v5, "h"
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v0, p2 */
/* move-object v1, v4 */
/* move-object v2, v5 */
v4 = /* move v3, v6 */
/* move v0, v4 */
/* int-to-float v0, v0 */
/* move/from16 v16, v0 */
int v4 = 0; // const/4 v4, 0x0
final String v5 = "w"; // const-string v5, "w"
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v0, p2 */
/* move-object v1, v4 */
/* move-object v2, v5 */
v4 = /* move v3, v6 */
/* move v0, v4 */
/* int-to-float v0, v0 */
/* move/from16 v17, v0 */
int v4 = 0; // const/4 v4, 0x0
final String v5 = "x"; // const-string v5, "x"
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v0, p2 */
/* move-object v1, v4 */
/* move-object v2, v5 */
v4 = /* move v3, v6 */
/* move v0, v4 */
/* int-to-float v0, v0 */
/* move/from16 v18, v0 */
int v4 = 0; // const/4 v4, 0x0
final String v5 = "y"; // const-string v5, "y"
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v0, p2 */
/* move-object v1, v4 */
/* move-object v2, v5 */
v4 = /* move v3, v6 */
/* move v0, v4 */
/* int-to-float v0, v0 */
/* move/from16 v19, v0 */
int v4 = 0; // const/4 v4, 0x0
final String v5 = "cx"; // const-string v5, "cx"
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v0, p2 */
/* move-object v1, v4 */
/* move-object v2, v5 */
v4 = /* move v3, v6 */
/* move v0, v4 */
/* int-to-float v0, v0 */
/* move/from16 v20, v0 */
int v4 = 0; // const/4 v4, 0x0
final String v5 = "cy"; // const-string v5, "cy"
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v0, p2 */
/* move-object v1, v4 */
/* move-object v2, v5 */
v4 = /* move v3, v6 */
/* move v0, v4 */
/* int-to-float v0, v0 */
/* move/from16 v21, v0 */
int v4 = 0; // const/4 v4, 0x0
final String v5 = "sx"; // const-string v5, "sx"
/* const/high16 v6, 0x3f800000 # 1.0f */
/* move-object/from16 v0, p2 */
/* move-object v1, v4 */
/* move-object v2, v5 */
v22 = /* move v3, v6 */
int v4 = 0; // const/4 v4, 0x0
final String v5 = "sy"; // const-string v5, "sy"
/* const/high16 v6, 0x3f800000 # 1.0f */
/* move-object/from16 v0, p2 */
/* move-object v1, v4 */
/* move-object v2, v5 */
v23 = /* move v3, v6 */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->f:J */
/* move-wide v4, v0 */
/* div-int/lit8 v6, v15, 0x8 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v7, v0 */
/* iget v7, v7, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* int-to-float v7, v7 */
/* div-float v7, v18, v7 */
/* add-float/2addr v7, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v8, v0 */
/* iget v8, v8, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* int-to-float v8, v8 */
/* div-float v8, v19, v8 */
/* add-float/2addr v8, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v9, v0 */
/* iget v9, v9, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* int-to-float v9, v9 */
/* div-float v9, v17, v9 */
/* sub-float/2addr v9, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
/* iget v10, v10, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* int-to-float v10, v10 */
/* div-float v10, v16, v10 */
/* sub-float/2addr v10, v14 */
/* invoke-static/range {v4 ..v10}, Lcom/doodlemobile/basket/graphics/DTileAnimation;->setTileTexcoord(JIFFFF)V */
/* move-object/from16 v0, p0 */
/* iget-wide v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->f:J */
/* move-wide v4, v0 */
/* div-int/lit8 v6, v15, 0x8 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->m:F */
/* move v7, v0 */
/* mul-float v7, v7, v20 */
/* mul-float v7, v7, v22 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->m:F */
/* move v8, v0 */
/* mul-float v8, v8, v21 */
/* mul-float v8, v8, v23 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->m:F */
/* move v9, v0 */
/* mul-float v9, v9, v17 */
/* mul-float v9, v9, v22 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/DTileAnimation;->m:F */
/* move v10, v0 */
/* mul-float v10, v10, v16 */
/* mul-float v10, v10, v23 */
/* invoke-static/range {v4 ..v10}, Lcom/doodlemobile/basket/graphics/DTileAnimation;->setTileVertices(JIFFFF)V */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v4, v0 */
/* add-int/lit8 v5, v15, 0x1 */
/* aput v18, v4, v15 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v4, v0 */
/* add-int/lit8 v6, v5, 0x1 */
/* aput v19, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v4, v0 */
/* add-int/lit8 v5, v6, 0x1 */
/* aput v17, v4, v6 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v4, v0 */
/* add-int/lit8 v6, v5, 0x1 */
/* aput v16, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v4, v0 */
/* add-int/lit8 v5, v6, 0x1 */
/* aput v20, v4, v6 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v4, v0 */
/* add-int/lit8 v6, v5, 0x1 */
/* aput v21, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v4, v0 */
/* add-int/lit8 v5, v6, 0x1 */
/* aput v22, v4, v6 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v4, v0 */
/* add-int/lit8 v6, v5, 0x1 */
/* aput v23, v4, v5 */
/* move v15, v6 */
/* goto/16 :goto_1 */
} // :cond_5
/* invoke-static/range {p1 ..p1}, Lcom/doodlemobile/basket/graphics/DTileAnimation;->a(Lorg/xmlpull/v1/XmlPullParser;)V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 ..:try_end_0} :catch_2 */
/* goto/16 :goto_1 */
/* :catch_0 */
/* move-exception v4 */
/* new-instance v5, Landroid/view/InflateException; */
/* invoke-direct {v5, v4}, Landroid/view/InflateException;-><init>(Ljava/lang/Throwable;)V */
/* throw v5 */
} // :cond_6
try { // :try_start_1
final String v5 = "actions"; // const-string v5, "actions"
v4 = (( java.lang.String ) v5 ).compareToIgnoreCase ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I
/* if-nez v4, :cond_15 */
/* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
v5 = /* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 ..:try_end_1} :catch_2 */
int v4 = 0; // const/4 v4, 0x0
/* move v6, v4 */
} // :cond_7
} // :goto_2
try { // :try_start_2
v4 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I */
int v7 = 3; // const/4 v7, 0x3
/* if-ne v4, v7, :cond_8 */
v7 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
/* if-le v7, v5, :cond_11 */
} // :cond_8
int v7 = 1; // const/4 v7, 0x1
/* if-eq v4, v7, :cond_11 */
int v7 = 2; // const/4 v7, 0x2
/* if-ne v4, v7, :cond_7 */
/* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String; */
final String v7 = "action"; // const-string v7, "action"
v4 = (( java.lang.String ) v7 ).compareToIgnoreCase ( v4 ); // invoke-virtual {v7, v4}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I
/* if-nez v4, :cond_10 */
v4 = com.doodlemobile.basket.graphics.DTileAnimation.n;
/* array-length v4, v4 */
/* if-lt v6, v4, :cond_9 */
v4 = com.doodlemobile.basket.graphics.DTileAnimation.n;
v7 = com.doodlemobile.basket.graphics.DTileAnimation.n;
/* array-length v7, v7 */
/* add-int/lit8 v7, v7, 0x20 */
com.doodlemobile.basket.util.Util .a ( v4,v7 );
v4 = com.doodlemobile.basket.graphics.DTileAnimation.o;
v7 = com.doodlemobile.basket.graphics.DTileAnimation.o;
/* array-length v7, v7 */
/* add-int/lit8 v7, v7, 0x20 */
com.doodlemobile.basket.util.Util .a ( v4,v7 );
v4 = com.doodlemobile.basket.graphics.DTileAnimation.p;
v7 = com.doodlemobile.basket.graphics.DTileAnimation.p;
/* array-length v7, v7 */
/* add-int/lit8 v7, v7, 0x20 */
com.doodlemobile.basket.util.Util .a ( v4,v7 );
/* check-cast v4, [[I */
v4 = com.doodlemobile.basket.graphics.DTileAnimation.q;
v7 = com.doodlemobile.basket.graphics.DTileAnimation.q;
/* array-length v7, v7 */
/* add-int/lit8 v7, v7, 0x20 */
com.doodlemobile.basket.util.Util .a ( v4,v7 );
/* check-cast v4, [[I */
} // :cond_9
v4 = com.doodlemobile.basket.graphics.DTileAnimation.n;
int v7 = 0; // const/4 v7, 0x0
final String v8 = "id"; // const-string v8, "id"
int v9 = -1; // const/4 v9, -0x1
/* move-object/from16 v0, p2 */
/* move-object v1, v7 */
/* move-object v2, v8 */
v7 = /* move v3, v9 */
/* aput v7, v4, v6 */
int v4 = 0; // const/4 v4, 0x0
final String v7 = "repeat"; // const-string v7, "repeat"
int v8 = 0; // const/4 v8, 0x0
/* move-object/from16 v0, p2 */
/* move-object v1, v4 */
/* move-object v2, v7 */
v4 = /* move v3, v8 */
if ( v4 != null) { // if-eqz v4, :cond_d
v4 = com.doodlemobile.basket.graphics.DTileAnimation.o;
v7 = com.doodlemobile.basket.graphics.DTileAnimation.n;
/* aget v7, v7, v6 */
/* aput v7, v4, v6 */
} // :goto_3
v4 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
int v7 = 0; // const/4 v7, 0x0
} // :cond_a
} // :goto_4
v8 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I */
int v9 = 3; // const/4 v9, 0x3
/* if-ne v8, v9, :cond_b */
v9 = /* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I */
/* if-le v9, v4, :cond_f */
} // :cond_b
int v9 = 1; // const/4 v9, 0x1
/* if-eq v8, v9, :cond_f */
int v9 = 2; // const/4 v9, 0x2
/* if-ne v8, v9, :cond_a */
/* invoke-interface/range {p1 ..p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String; */
final String v9 = "sequence"; // const-string v9, "sequence"
v8 = (( java.lang.String ) v9 ).compareToIgnoreCase ( v8 ); // invoke-virtual {v9, v8}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I
/* if-nez v8, :cond_e */
v8 = com.doodlemobile.basket.graphics.DTileAnimation.r;
/* array-length v8, v8 */
/* if-lt v7, v8, :cond_c */
v8 = com.doodlemobile.basket.graphics.DTileAnimation.r;
v9 = com.doodlemobile.basket.graphics.DTileAnimation.r;
/* array-length v9, v9 */
/* add-int/lit8 v9, v9, 0x20 */
com.doodlemobile.basket.util.Util .a ( v8,v9 );
v8 = com.doodlemobile.basket.graphics.DTileAnimation.s;
v9 = com.doodlemobile.basket.graphics.DTileAnimation.s;
/* array-length v9, v9 */
/* add-int/lit8 v9, v9, 0x20 */
com.doodlemobile.basket.util.Util .a ( v8,v9 );
} // :cond_c
v8 = com.doodlemobile.basket.graphics.DTileAnimation.r;
int v9 = 0; // const/4 v9, 0x0
final String v10 = "f"; // const-string v10, "f"
int v12 = 0; // const/4 v12, 0x0
/* move-object/from16 v0, p2 */
/* move-object v1, v9 */
/* move-object v2, v10 */
v9 = /* move v3, v12 */
/* aput v9, v8, v7 */
v8 = com.doodlemobile.basket.graphics.DTileAnimation.s;
int v9 = 0; // const/4 v9, 0x0
final String v10 = "d"; // const-string v10, "d"
/* const/16 v12, 0x64 */
/* move-object/from16 v0, p2 */
/* move-object v1, v9 */
/* move-object v2, v10 */
v9 = /* move v3, v12 */
/* aput v9, v8, v7 */
/* add-int/lit8 v7, v7, 0x1 */
} // :cond_d
v4 = com.doodlemobile.basket.graphics.DTileAnimation.o;
int v7 = 0; // const/4 v7, 0x0
final String v8 = "next"; // const-string v8, "next"
int v9 = -1; // const/4 v9, -0x1
/* move-object/from16 v0, p2 */
/* move-object v1, v7 */
/* move-object v2, v8 */
v7 = /* move v3, v9 */
/* aput v7, v4, v6 */
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 ..:try_end_2} :catch_3 */
/* :catch_1 */
/* move-exception v4 */
try { // :try_start_3
/* new-instance v5, Landroid/view/InflateException; */
/* invoke-direct {v5, v4}, Landroid/view/InflateException;-><init>(Ljava/lang/Throwable;)V */
/* throw v5 */
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 ..:try_end_3} :catch_2 */
/* :catch_2 */
/* move-exception v4 */
/* new-instance v5, Landroid/view/InflateException; */
/* invoke-direct {v5, v4}, Landroid/view/InflateException;-><init>(Ljava/lang/Throwable;)V */
/* throw v5 */
} // :cond_e
try { // :try_start_4
/* invoke-static/range {p1 ..p1}, Lcom/doodlemobile/basket/graphics/DTileAnimation;->a(Lorg/xmlpull/v1/XmlPullParser;)V */
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_1 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 ..:try_end_4} :catch_3 */
/* goto/16 :goto_4 */
/* :catch_3 */
/* move-exception v4 */
try { // :try_start_5
/* new-instance v5, Landroid/view/InflateException; */
/* invoke-direct {v5, v4}, Landroid/view/InflateException;-><init>(Ljava/lang/Throwable;)V */
/* throw v5 */
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 ..:try_end_5} :catch_2 */
} // :cond_f
try { // :try_start_6
v4 = com.doodlemobile.basket.graphics.DTileAnimation.p;
v8 = com.doodlemobile.basket.graphics.DTileAnimation.r;
com.doodlemobile.basket.util.Util .a ( v8,v7 );
/* aput-object v8, v4, v6 */
v4 = com.doodlemobile.basket.graphics.DTileAnimation.q;
v8 = com.doodlemobile.basket.graphics.DTileAnimation.s;
com.doodlemobile.basket.util.Util .a ( v8,v7 );
/* aput-object v7, v4, v6 */
/* add-int/lit8 v4, v6, 0x1 */
/* move v6, v4 */
/* goto/16 :goto_2 */
} // :cond_10
/* invoke-static/range {p1 ..p1}, Lcom/doodlemobile/basket/graphics/DTileAnimation;->a(Lorg/xmlpull/v1/XmlPullParser;)V */
/* goto/16 :goto_2 */
} // :cond_11
v4 = com.doodlemobile.basket.graphics.DTileAnimation.n;
com.doodlemobile.basket.util.Util .a ( v4,v6 );
/* move-object v0, v4 */
/* move-object/from16 v1, p0 */
this.h = v0;
v4 = com.doodlemobile.basket.graphics.DTileAnimation.o;
com.doodlemobile.basket.util.Util .a ( v4,v6 );
/* move-object v0, v4 */
/* move-object/from16 v1, p0 */
this.k = v0;
int v4 = 0; // const/4 v4, 0x0
} // :goto_5
/* move-object/from16 v0, p0 */
v0 = this.k;
/* move-object v5, v0 */
/* array-length v5, v5 */
/* if-ge v4, v5, :cond_14 */
/* move-object/from16 v0, p0 */
v0 = this.k;
/* move-object v5, v0 */
/* move-object/from16 v0, p0 */
v0 = this.h;
/* move-object v7, v0 */
/* move-object/from16 v0, p0 */
v0 = this.k;
/* move-object v8, v0 */
/* aget v8, v8, v4 */
int v9 = 0; // const/4 v9, 0x0
} // :goto_6
/* array-length v10, v7 */
/* if-ge v9, v10, :cond_13 */
/* aget v10, v7, v9 */
/* if-ne v10, v8, :cond_12 */
/* move v7, v9 */
} // :goto_7
/* aput v7, v5, v4 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_12
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_13
int v7 = -1; // const/4 v7, -0x1
} // :cond_14
v4 = com.doodlemobile.basket.graphics.DTileAnimation.p;
com.doodlemobile.basket.util.Util .a ( v4,v6 );
/* check-cast v4, [[I */
/* move-object v0, v4 */
/* move-object/from16 v1, p0 */
this.i = v0;
v4 = com.doodlemobile.basket.graphics.DTileAnimation.q;
com.doodlemobile.basket.util.Util .a ( v4,v6 );
/* check-cast v4, [[I */
/* move-object v0, v4 */
/* move-object/from16 v1, p0 */
this.j = v0;
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_1 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_6 ..:try_end_6} :catch_3 */
/* goto/16 :goto_0 */
} // :cond_15
try { // :try_start_7
/* invoke-static/range {p1 ..p1}, Lcom/doodlemobile/basket/graphics/DTileAnimation;->a(Lorg/xmlpull/v1/XmlPullParser;)V */
/* :try_end_7 */
/* .catch Ljava/io/IOException; {:try_start_7 ..:try_end_7} :catch_0 */
/* .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_7 ..:try_end_7} :catch_2 */
/* goto/16 :goto_0 */
} // :cond_16
return;
} // .end method
