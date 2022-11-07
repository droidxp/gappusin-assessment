public class inal {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static Boolean a ( com.badlogic.gdx.math.Vector2 p0, com.badlogic.gdx.math.Vector2 p1, com.badlogic.gdx.math.Vector2 p2, com.badlogic.gdx.math.Vector2 p3 ) {
		 /* .locals 7 */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* sub-float/2addr v0, v1 */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* sub-float/2addr v1, v2 */
		 /* iget v2, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* sub-float/2addr v2, v3 */
		 /* iget v3, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* iget v4, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* sub-float/2addr v3, v4 */
		 /* iget v4, p3, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v5, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* sub-float/2addr v4, v5 */
		 /* iget v5, p3, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* iget v6, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* sub-float/2addr v5, v6 */
		 /* mul-float/2addr v3, v0 */
		 /* mul-float/2addr v2, v1 */
		 /* sub-float v2, v3, v2 */
		 /* mul-float/2addr v0, v5 */
		 /* mul-float/2addr v1, v4 */
		 /* sub-float/2addr v0, v1 */
		 /* mul-float/2addr v0, v2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* cmpl-float v0, v0, v1 */
		 /* if-lez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean a ( java.util.ArrayList p0, com.badlogic.gdx.math.Vector2 p1 ) {
/* .locals 10 */
int v8 = 1; // const/4 v8, 0x1
int v7 = 0; // const/4 v7, 0x0
if ( p0 != null) { // if-eqz p0, :cond_0
	 v0 = 	 (( java.util.ArrayList ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
	 int v1 = 3; // const/4 v1, 0x3
	 /* if-ge v0, v1, :cond_1 */
} // :cond_0
/* move v0, v7 */
} // :goto_0
} // :cond_1
/* if-nez p0, :cond_2 */
/* move v0, v7 */
} // :goto_1
/* if-nez v0, :cond_9 */
/* move v0, v7 */
} // :cond_2
(( java.util.ArrayList ) p0 ).get ( v7 ); // invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
(( java.util.ArrayList ) p0 ).get ( v7 ); // invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v2, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
(( java.util.ArrayList ) p0 ).get ( v7 ); // invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v3, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( java.util.ArrayList ) p0 ).get ( v7 ); // invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
v4 = (( java.util.ArrayList ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
/* move v5, v0 */
/* move v6, v3 */
/* move v3, v8 */
/* move v9, v2 */
/* move v2, v1 */
/* move v1, v9 */
} // :goto_2
/* if-ge v3, v4, :cond_6 */
(( java.util.ArrayList ) p0 ).get ( v3 ); // invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_4 */
(( java.util.ArrayList ) p0 ).get ( v3 ); // invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move v1, v0 */
} // :cond_3
} // :goto_3
(( java.util.ArrayList ) p0 ).get ( v3 ); // invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* cmpl-float v0, v0, v5 */
/* if-lez v0, :cond_5 */
(( java.util.ArrayList ) p0 ).get ( v3 ); // invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move v5, v6 */
} // :goto_4
/* add-int/lit8 v3, v3, 0x1 */
/* move v6, v5 */
/* move v5, v0 */
} // :cond_4
(( java.util.ArrayList ) p0 ).get ( v3 ); // invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* cmpg-float v0, v0, v2 */
/* if-gez v0, :cond_3 */
(( java.util.ArrayList ) p0 ).get ( v3 ); // invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* move v2, v0 */
} // :cond_5
(( java.util.ArrayList ) p0 ).get ( v3 ); // invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* cmpg-float v0, v0, v6 */
/* if-gez v0, :cond_e */
(( java.util.ArrayList ) p0 ).get ( v3 ); // invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move v9, v5 */
/* move v5, v0 */
/* move v0, v9 */
} // :cond_6
/* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* cmpl-float v0, v0, v1 */
/* if-gtz v0, :cond_7 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* cmpg-float v0, v0, v2 */
/* if-ltz v0, :cond_7 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* cmpl-float v0, v0, v5 */
/* if-gtz v0, :cond_7 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* cmpg-float v0, v0, v6 */
/* if-gez v0, :cond_8 */
} // :cond_7
/* move v0, v7 */
/* goto/16 :goto_1 */
} // :cond_8
/* move v0, v8 */
/* goto/16 :goto_1 */
} // :cond_9
/* new-instance v2, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* const/high16 v1, 0x43f00000 # 480.0f */
/* add-float/2addr v0, v1 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* invoke-direct {v2, v0, v1}, Lcom/badlogic/gdx/math/Vector2;-><init>(FF)V */
v3 = (( java.util.ArrayList ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
/* move v4, v7 */
/* move v5, v7 */
} // :goto_5
/* if-ge v4, v3, :cond_b */
/* add-int/lit8 v0, v4, 0x1 */
/* rem-int v1, v0, v3 */
(( java.util.ArrayList ) p0 ).get ( v4 ); // invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
(( java.util.ArrayList ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Lcom/badlogic/gdx/math/Vector2; */
v6 = com.doodle.ltcsmyp.a.d .a ( v0,v1,p1,v2 );
/* if-nez v6, :cond_a */
v0 = com.doodle.ltcsmyp.a.d .a ( p1,v2,v0,v1 );
/* if-nez v0, :cond_a */
/* move v0, v8 */
} // :goto_6
if ( v0 != null) { // if-eqz v0, :cond_d
/* add-int/lit8 v0, v5, 0x1 */
} // :goto_7
/* add-int/lit8 v1, v4, 0x1 */
/* move v4, v1 */
/* move v5, v0 */
} // :cond_a
/* move v0, v7 */
} // :cond_b
/* rem-int/lit8 v0, v5, 0x2 */
/* if-ne v0, v8, :cond_c */
/* move v0, v8 */
/* goto/16 :goto_0 */
} // :cond_c
/* move v0, v7 */
/* goto/16 :goto_0 */
} // :cond_d
/* move v0, v5 */
} // :cond_e
/* move v0, v5 */
/* move v5, v6 */
/* goto/16 :goto_4 */
} // .end method
