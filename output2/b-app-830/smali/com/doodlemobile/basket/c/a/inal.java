class inal {
	 /* # static fields */
	 static final a; //synthetic
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 3 */
		 com.badlogic.gdx.physics.box2d.Shape$Type .values ( );
		 /* array-length v0, v0 */
		 /* new-array v0, v0, [I */
		 try { // :try_start_0
			 v0 = com.doodlemobile.basket.c.a.a.a;
			 v1 = com.badlogic.gdx.physics.box2d.Shape$Type.Circle;
			 v1 = 			 (( com.badlogic.gdx.physics.box2d.Shape$Type ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/badlogic/gdx/physics/box2d/Shape$Type;->ordinal()I
			 int v2 = 1; // const/4 v2, 0x1
			 /* aput v2, v0, v1 */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_2 */
		 } // :goto_0
		 try { // :try_start_1
			 v0 = com.doodlemobile.basket.c.a.a.a;
			 v1 = com.badlogic.gdx.physics.box2d.Shape$Type.Polygon;
			 v1 = 			 (( com.badlogic.gdx.physics.box2d.Shape$Type ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/badlogic/gdx/physics/box2d/Shape$Type;->ordinal()I
			 int v2 = 2; // const/4 v2, 0x2
			 /* aput v2, v0, v1 */
			 /* :try_end_1 */
			 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_1 */
		 } // :goto_1
		 try { // :try_start_2
			 v0 = com.doodlemobile.basket.c.a.a.a;
			 v1 = com.badlogic.gdx.physics.box2d.Shape$Type.Edge;
			 v1 = 			 (( com.badlogic.gdx.physics.box2d.Shape$Type ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/badlogic/gdx/physics/box2d/Shape$Type;->ordinal()I
			 int v2 = 3; // const/4 v2, 0x3
			 /* aput v2, v0, v1 */
			 /* :try_end_2 */
			 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_0 */
		 } // :goto_2
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* :catch_1 */
		 /* move-exception v0 */
		 /* :catch_2 */
		 /* move-exception v0 */
	 } // .end method
