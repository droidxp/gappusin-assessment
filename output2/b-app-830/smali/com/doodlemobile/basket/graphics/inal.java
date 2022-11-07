public class inal {
	 /* # static fields */
	 private static com.doodlemobile.basket.util.a a;
	 private static Integer b;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x20 */
		 /* new-array v0, v0, [Lcom/doodlemobile/basket/util/a; */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( ) {
		 /* .locals 5 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* sub-int/2addr v0, v2 */
		 /* if-nez v0, :cond_0 */
		 v0 = com.doodlemobile.basket.r.a;
		 /* const/16 v1, 0xc11 */
	 } // :goto_0
	 return;
} // :cond_0
v0 = com.doodlemobile.basket.graphics.c.a;
/* sub-int/2addr v1, v2 */
/* aget-object v0, v0, v1 */
v1 = com.doodlemobile.basket.r.a;
/* iget v2, v0, Lcom/doodlemobile/basket/util/a;->a:I */
/* iget v3, v0, Lcom/doodlemobile/basket/util/a;->b:I */
/* iget v4, v0, Lcom/doodlemobile/basket/util/a;->c:I */
/* iget v0, v0, Lcom/doodlemobile/basket/util/a;->d:I */
} // .end method
public static void a ( Object p0 ) {
/* .locals 7 */
int v6 = 1; // const/4 v6, 0x1
/* iget v0, p0, Lcom/doodlemobile/basket/util/a;->c:I */
/* if-gez v0, :cond_0 */
/* iget v0, p0, Lcom/doodlemobile/basket/util/a;->c:I */
/* neg-int v0, v0 */
/* iput v0, p0, Lcom/doodlemobile/basket/util/a;->c:I */
/* iget v0, p0, Lcom/doodlemobile/basket/util/a;->a:I */
/* iget v1, p0, Lcom/doodlemobile/basket/util/a;->c:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/util/a;->a:I */
} // :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/util/a;->d:I */
/* if-gez v0, :cond_1 */
/* iget v0, p0, Lcom/doodlemobile/basket/util/a;->b:I */
/* iget v1, p0, Lcom/doodlemobile/basket/util/a;->d:I */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/util/a;->b:I */
/* iget v0, p0, Lcom/doodlemobile/basket/util/a;->d:I */
/* neg-int v0, v0 */
/* iput v0, p0, Lcom/doodlemobile/basket/util/a;->d:I */
} // :cond_1
/* if-nez v0, :cond_3 */
v0 = com.doodlemobile.basket.r.a;
/* const/16 v1, 0xc11 */
} // :goto_0
/* add-int/lit8 v0, v0, 0x1 */
/* const/16 v1, 0x20 */
/* if-le v0, v1, :cond_2 */
final String v0 = "Basket"; // const-string v0, "Basket"
final String v1 = "what\'s wrong ? the stack is overflowing"; // const-string v1, "what\'s wrong ? the stack is overflowing"
android.util.Log .w ( v0,v1 );
} // :cond_2
v0 = com.doodlemobile.basket.graphics.c.a;
/* sub-int/2addr v1, v6 */
/* aput-object p0, v0, v1 */
v0 = com.doodlemobile.basket.r.a;
/* iget v1, p0, Lcom/doodlemobile/basket/util/a;->a:I */
/* iget v2, p0, Lcom/doodlemobile/basket/util/a;->b:I */
/* iget v3, p0, Lcom/doodlemobile/basket/util/a;->c:I */
/* iget v4, p0, Lcom/doodlemobile/basket/util/a;->d:I */
return;
} // :cond_3
v0 = com.doodlemobile.basket.graphics.c.a;
/* sub-int/2addr v1, v6 */
/* aget-object v0, v0, v1 */
/* iget v1, v0, Lcom/doodlemobile/basket/util/a;->a:I */
/* iget v2, p0, Lcom/doodlemobile/basket/util/a;->a:I */
v1 = java.lang.Math .max ( v1,v2 );
/* iget v2, v0, Lcom/doodlemobile/basket/util/a;->a:I */
/* iget v3, v0, Lcom/doodlemobile/basket/util/a;->c:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lcom/doodlemobile/basket/util/a;->a:I */
/* iget v4, p0, Lcom/doodlemobile/basket/util/a;->c:I */
/* add-int/2addr v3, v4 */
v2 = java.lang.Math .min ( v2,v3 );
/* iget v3, v0, Lcom/doodlemobile/basket/util/a;->b:I */
/* iget v4, p0, Lcom/doodlemobile/basket/util/a;->b:I */
v3 = java.lang.Math .max ( v3,v4 );
/* iget v4, v0, Lcom/doodlemobile/basket/util/a;->b:I */
/* iget v0, v0, Lcom/doodlemobile/basket/util/a;->d:I */
/* add-int/2addr v0, v4 */
/* iget v4, p0, Lcom/doodlemobile/basket/util/a;->b:I */
/* iget v5, p0, Lcom/doodlemobile/basket/util/a;->d:I */
/* add-int/2addr v4, v5 */
v0 = java.lang.Math .min ( v0,v4 );
/* iput v1, p0, Lcom/doodlemobile/basket/util/a;->a:I */
/* sub-int v1, v2, v1 */
v1 = java.lang.Math .max ( v6,v1 );
/* iput v1, p0, Lcom/doodlemobile/basket/util/a;->c:I */
/* iput v3, p0, Lcom/doodlemobile/basket/util/a;->b:I */
/* sub-int/2addr v0, v3 */
v0 = java.lang.Math .max ( v6,v0 );
/* iput v0, p0, Lcom/doodlemobile/basket/util/a;->d:I */
} // .end method
