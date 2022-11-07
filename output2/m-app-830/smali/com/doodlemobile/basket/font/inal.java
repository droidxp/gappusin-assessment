public class inal {
	 /* # static fields */
	 private static java.util.ArrayList a;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.doodlemobile.basket.font.e a ( Integer p0 ) {
		 /* .locals 6 */
		 int v5 = 0; // const/4 v5, 0x0
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = com.doodlemobile.basket.font.d.a;
		 v0 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 int v1 = 1; // const/4 v1, 0x1
		 /* sub-int/2addr v0, v1 */
		 /* move v1, v0 */
	 } // :goto_0
	 /* if-ltz v1, :cond_2 */
	 v0 = com.doodlemobile.basket.font.d.a;
	 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Lcom/doodlemobile/basket/font/e; */
	 /* iget v2, v0, Lcom/doodlemobile/basket/font/e;->c:I */
	 /* if-ne v2, p0, :cond_1 */
	 /* iget-boolean v2, v0, Lcom/doodlemobile/basket/font/e;->a:Z */
	 /* if-nez v2, :cond_1 */
	 /* iget-boolean v2, v0, Lcom/doodlemobile/basket/font/e;->b:Z */
	 /* if-nez v2, :cond_1 */
	 v2 = this.d;
	 /* if-nez v2, :cond_1 */
} // :goto_1
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/doodlemobile/basket/font/e; */
v1 = android.graphics.Typeface.DEFAULT;
/* move v2, p0 */
/* move v4, v3 */
/* invoke-direct/range {v0 ..v5}, Lcom/doodlemobile/basket/font/e;-><init>(Landroid/graphics/Typeface;IZZLjava/lang/String;)V */
v1 = com.doodlemobile.basket.font.d.a;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
} // :cond_1
/* add-int/lit8 v0, v1, -0x1 */
/* move v1, v0 */
} // :cond_2
/* move-object v0, v5 */
} // .end method
public static com.doodlemobile.basket.font.e a ( android.graphics.Typeface p0, Integer p1, Boolean p2, Boolean p3, java.lang.String p4 ) {
/* .locals 6 */
int v1 = 0; // const/4 v1, 0x0
v0 = com.doodlemobile.basket.font.d.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v0, v2 */
/* move v2, v0 */
} // :goto_0
/* if-ltz v2, :cond_2 */
v0 = com.doodlemobile.basket.font.d.a;
(( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/doodlemobile/basket/font/e; */
/* iget v3, v0, Lcom/doodlemobile/basket/font/e;->c:I */
/* if-ne v3, p1, :cond_1 */
/* iget-boolean v3, v0, Lcom/doodlemobile/basket/font/e;->a:Z */
/* if-ne v3, p2, :cond_1 */
/* iget-boolean v3, v0, Lcom/doodlemobile/basket/font/e;->b:Z */
/* if-ne v3, p3, :cond_1 */
v3 = this.d;
/* if-ne v3, p4, :cond_1 */
} // :goto_1
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/doodlemobile/basket/font/e; */
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/doodlemobile/basket/font/e;-><init>(Landroid/graphics/Typeface;IZZLjava/lang/String;)V */
v1 = com.doodlemobile.basket.font.d.a;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
} // :cond_1
/* add-int/lit8 v0, v2, -0x1 */
/* move v2, v0 */
} // :cond_2
/* move-object v0, v1 */
} // .end method
public static com.doodlemobile.basket.font.e a ( Object p0, Integer p1, Boolean p2, java.lang.String p3 ) {
/* .locals 6 */
int v4 = 0; // const/4 v4, 0x0
int v1 = 0; // const/4 v1, 0x0
v0 = com.doodlemobile.basket.font.d.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v0, v2 */
/* move v2, v0 */
} // :goto_0
/* if-ltz v2, :cond_3 */
v0 = com.doodlemobile.basket.font.d.a;
(( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/doodlemobile/basket/font/e; */
/* iget v3, v0, Lcom/doodlemobile/basket/font/e;->c:I */
/* if-ne v3, p1, :cond_1 */
/* iget-boolean v3, v0, Lcom/doodlemobile/basket/font/e;->a:Z */
/* if-ne v3, p2, :cond_1 */
/* iget-boolean v3, v0, Lcom/doodlemobile/basket/font/e;->b:Z */
/* if-nez v3, :cond_1 */
v3 = this.d;
/* if-ne v3, p3, :cond_1 */
} // :goto_1
/* if-nez v0, :cond_0 */
/* if-nez p3, :cond_2 */
/* new-instance v0, Lcom/doodlemobile/basket/font/e; */
v1 = android.graphics.Typeface.DEFAULT;
/* move v2, p1 */
/* move v3, p2 */
/* move-object v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/doodlemobile/basket/font/e;-><init>(Landroid/graphics/Typeface;IZZLjava/lang/String;)V */
} // :goto_2
v1 = com.doodlemobile.basket.font.d.a;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
} // :cond_1
/* add-int/lit8 v0, v2, -0x1 */
/* move v2, v0 */
} // :cond_2
android.graphics.Typeface .createFromAsset ( v0,p3 );
/* new-instance v0, Lcom/doodlemobile/basket/font/e; */
/* move v2, p1 */
/* move v3, p2 */
/* move-object v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/doodlemobile/basket/font/e;-><init>(Landroid/graphics/Typeface;IZZLjava/lang/String;)V */
} // :cond_3
/* move-object v0, v1 */
} // .end method
public static void a ( ) {
/* .locals 1 */
v0 = com.doodlemobile.basket.font.d.a;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
