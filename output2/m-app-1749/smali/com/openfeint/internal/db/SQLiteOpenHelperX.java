public abstract class com.openfeint.internal.db.SQLiteOpenHelperX {
	 /* .source "SQLiteOpenHelperX.java" */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 private android.database.sqlite.SQLiteDatabase mDatabase;
	 private android.database.sqlite.SQLiteOpenHelper mHelper;
	 private java.lang.String mName;
	 private Integer mNewVersion;
	 /* # direct methods */
	 static com.openfeint.internal.db.SQLiteOpenHelperX ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 12 */
		 /* const-class v0, Lcom/openfeint/internal/db/SQLiteOpenHelperX; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public com.openfeint.internal.db.SQLiteOpenHelperX ( ) {
		 /* .locals 1 */
		 /* .param p1, "helper" # Landroid/database/sqlite/SQLiteOpenHelper; */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 16 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.mDatabase = v0;
		 /* .line 25 */
		 this.mHelper = p1;
		 /* .line 26 */
		 return;
	 } // .end method
	 public com.openfeint.internal.db.SQLiteOpenHelperX ( ) {
		 /* .locals 3 */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .param p2, "version" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 16 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.mDatabase = v0;
		 /* .line 19 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-ge p2, v0, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Version must be >= 1, was "; // const-string v2, "Version must be >= 1, was "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
		 /* .line 20 */
	 } // :cond_0
	 this.mName = p1;
	 /* .line 21 */
	 /* iput p2, p0, Lcom/openfeint/internal/db/SQLiteOpenHelperX;->mNewVersion:I */
	 /* .line 22 */
	 return;
} // .end method
/* # virtual methods */
public synchronized void close ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 141 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 v0 = this.mDatabase;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.mDatabase;
			 v0 = 			 (( android.database.sqlite.SQLiteDatabase ) v0 ).isOpen ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 142 */
				 v0 = this.mDatabase;
				 (( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
				 /* .line 143 */
				 int v0 = 0; // const/4 v0, 0x0
				 this.mDatabase = v0;
				 /* .line 145 */
			 } // :cond_0
			 v0 = this.mHelper;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 146 */
				 v0 = this.mHelper;
				 (( android.database.sqlite.SQLiteOpenHelper ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* .line 148 */
			 } // :cond_1
			 /* monitor-exit p0 */
			 return;
			 /* .line 141 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
		 public synchronized android.database.sqlite.SQLiteDatabase getReadableDatabase ( ) {
			 /* .locals 5 */
			 /* .prologue */
			 /* .line 107 */
			 /* monitor-enter p0 */
			 try { // :try_start_0
				 v2 = this.mHelper;
				 if ( v2 != null) { // if-eqz v2, :cond_1
					 /* .line 108 */
					 v2 = this.mHelper;
					 (( android.database.sqlite.SQLiteOpenHelper ) v2 ).getReadableDatabase ( ); // invoke-virtual {v2}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* .line 133 */
				 } // :cond_0
			 } // :goto_0
			 /* monitor-exit p0 */
			 /* .line 110 */
		 } // :cond_1
		 try { // :try_start_1
			 v2 = this.mDatabase;
			 if ( v2 != null) { // if-eqz v2, :cond_2
				 v2 = this.mDatabase;
				 v2 = 				 (( android.database.sqlite.SQLiteDatabase ) v2 ).isOpen ( ); // invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
				 if ( v2 != null) { // if-eqz v2, :cond_2
					 /* .line 111 */
					 v2 = this.mDatabase;
					 /* :try_end_1 */
					 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
					 /* .line 115 */
				 } // :cond_2
				 try { // :try_start_2
					 (( com.openfeint.internal.db.SQLiteOpenHelperX ) p0 ).getWritableDatabase ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/db/SQLiteOpenHelperX;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
					 /* :try_end_2 */
					 /* .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 ..:try_end_2} :catch_0 */
					 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
					 /* .line 116 */
					 /* :catch_0 */
					 /* move-exception v1 */
					 /* .line 117 */
					 /* .local v1, "e":Landroid/database/sqlite/SQLiteException; */
					 try { // :try_start_3
						 v2 = this.mName;
						 /* if-nez v2, :cond_3 */
						 /* throw v1 */
						 /* :try_end_3 */
						 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
						 /* .line 107 */
					 } // .end local v1 # "e":Landroid/database/sqlite/SQLiteException;
					 /* :catchall_0 */
					 /* move-exception v2 */
					 /* monitor-exit p0 */
					 /* throw v2 */
					 /* .line 118 */
					 /* .restart local v1 # "e":Landroid/database/sqlite/SQLiteException; */
				 } // :cond_3
				 try { // :try_start_4
					 v2 = com.openfeint.internal.db.SQLiteOpenHelperX.TAG;
					 /* new-instance v3, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
					 final String v4 = "Couldn\'t open "; // const-string v4, "Couldn\'t open "
					 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 v4 = this.mName;
					 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 final String v4 = " for writing (will try read-only):"; // const-string v4, " for writing (will try read-only):"
					 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 android.util.Log .e ( v2,v3,v1 );
					 /* :try_end_4 */
					 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
					 /* .line 121 */
					 int v0 = 0; // const/4 v0, 0x0
					 /* .line 123 */
					 /* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
					 try { // :try_start_5
						 v2 = this.mName;
						 int v3 = 0; // const/4 v3, 0x0
						 int v4 = 1; // const/4 v4, 0x1
						 android.database.sqlite.SQLiteDatabase .openDatabase ( v2,v3,v4 );
						 /* .line 124 */
						 v2 = 						 (( android.database.sqlite.SQLiteDatabase ) v0 ).getVersion ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getVersion()I
						 /* iget v3, p0, Lcom/openfeint/internal/db/SQLiteOpenHelperX;->mNewVersion:I */
						 /* if-eq v2, v3, :cond_5 */
						 /* .line 125 */
						 /* new-instance v2, Landroid/database/sqlite/SQLiteException; */
						 /* new-instance v3, Ljava/lang/StringBuilder; */
						 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
						 final String v4 = "Can\'t upgrade read-only database from version "; // const-string v4, "Can\'t upgrade read-only database from version "
						 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 v4 = 						 (( android.database.sqlite.SQLiteDatabase ) v0 ).getVersion ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getVersion()I
						 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
						 final String v4 = " to "; // const-string v4, " to "
						 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 /* iget v4, p0, Lcom/openfeint/internal/db/SQLiteOpenHelperX;->mNewVersion:I */
						 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
						 final String v4 = ": "; // const-string v4, ": "
						 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 v4 = this.mName;
						 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
						 /* invoke-direct {v2, v3}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V */
						 /* throw v2 */
						 /* :try_end_5 */
						 /* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
						 /* .line 133 */
						 /* :catchall_1 */
						 /* move-exception v2 */
						 if ( v0 != null) { // if-eqz v0, :cond_4
							 try { // :try_start_6
								 v3 = this.mDatabase;
								 /* if-eq v0, v3, :cond_4 */
								 (( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
							 } // :cond_4
							 /* throw v2 */
							 /* :try_end_6 */
							 /* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
							 /* .line 129 */
						 } // :cond_5
						 try { // :try_start_7
							 v2 = com.openfeint.internal.db.SQLiteOpenHelperX.TAG;
							 /* new-instance v3, Ljava/lang/StringBuilder; */
							 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
							 final String v4 = "Opened "; // const-string v4, "Opened "
							 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
							 v4 = this.mName;
							 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
							 final String v4 = " in read-only mode"; // const-string v4, " in read-only mode"
							 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
							 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
							 android.util.Log .w ( v2,v3 );
							 /* .line 130 */
							 this.mDatabase = v0;
							 /* .line 131 */
							 v2 = this.mDatabase;
							 /* :try_end_7 */
							 /* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
							 /* .line 133 */
							 if ( v0 != null) { // if-eqz v0, :cond_0
								 try { // :try_start_8
									 v3 = this.mDatabase;
									 /* if-eq v0, v3, :cond_0 */
									 (( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
									 /* :try_end_8 */
									 /* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
									 /* goto/16 :goto_0 */
								 } // .end method
								 public synchronized android.database.sqlite.SQLiteDatabase getWritableDatabase ( ) {
									 /* .locals 5 */
									 /* .prologue */
									 /* .line 53 */
									 /* monitor-enter p0 */
									 try { // :try_start_0
										 v3 = this.mHelper;
										 if ( v3 != null) { // if-eqz v3, :cond_1
											 /* .line 54 */
											 v3 = this.mHelper;
											 (( android.database.sqlite.SQLiteOpenHelper ) v3 ).getWritableDatabase ( ); // invoke-virtual {v3}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
											 /* :try_end_0 */
											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
											 /* .line 88 */
										 } // :cond_0
									 } // :goto_0
									 /* monitor-exit p0 */
									 /* .line 56 */
								 } // :cond_1
								 try { // :try_start_1
									 v3 = this.mDatabase;
									 if ( v3 != null) { // if-eqz v3, :cond_2
										 v3 = this.mDatabase;
										 v3 = 										 (( android.database.sqlite.SQLiteDatabase ) v3 ).isOpen ( ); // invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z
										 if ( v3 != null) { // if-eqz v3, :cond_2
											 v3 = this.mDatabase;
											 v3 = 											 (( android.database.sqlite.SQLiteDatabase ) v3 ).isReadOnly ( ); // invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->isReadOnly()Z
											 /* if-nez v3, :cond_2 */
											 /* .line 57 */
											 v0 = this.mDatabase;
											 /* :try_end_1 */
											 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
											 /* .line 59 */
										 } // :cond_2
										 int v1 = 0; // const/4 v1, 0x0
										 /* .line 60 */
										 /* .local v1, "success":Z */
										 int v0 = 0; // const/4 v0, 0x0
										 /* .line 62 */
										 /* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
										 try { // :try_start_2
											 v3 = this.mName;
											 int v4 = 0; // const/4 v4, 0x0
											 android.database.sqlite.SQLiteDatabase .openOrCreateDatabase ( v3,v4 );
											 /* .line 64 */
											 v2 = 											 (( android.database.sqlite.SQLiteDatabase ) v0 ).getVersion ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getVersion()I
											 /* .line 65 */
											 /* .local v2, "version":I */
											 /* iget v3, p0, Lcom/openfeint/internal/db/SQLiteOpenHelperX;->mNewVersion:I */
											 /* if-eq v2, v3, :cond_3 */
											 /* .line 66 */
											 (( android.database.sqlite.SQLiteDatabase ) v0 ).beginTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
											 /* :try_end_2 */
											 /* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
											 /* .line 68 */
											 /* if-nez v2, :cond_5 */
											 /* .line 69 */
											 try { // :try_start_3
												 (( com.openfeint.internal.db.SQLiteOpenHelperX ) p0 ).onCreate ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/db/SQLiteOpenHelperX;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
												 /* .line 73 */
											 } // :goto_1
											 /* iget v3, p0, Lcom/openfeint/internal/db/SQLiteOpenHelperX;->mNewVersion:I */
											 (( android.database.sqlite.SQLiteDatabase ) v0 ).setVersion ( v3 ); // invoke-virtual {v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->setVersion(I)V
											 /* .line 74 */
											 (( android.database.sqlite.SQLiteDatabase ) v0 ).setTransactionSuccessful ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
											 /* :try_end_3 */
											 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
											 /* .line 76 */
											 try { // :try_start_4
												 (( android.database.sqlite.SQLiteDatabase ) v0 ).endTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
												 /* :try_end_4 */
												 /* .catchall {:try_start_4 ..:try_end_4} :catchall_2 */
												 /* .line 79 */
											 } // :cond_3
											 int v1 = 1; // const/4 v1, 0x1
											 /* .line 82 */
											 if ( v1 != null) { // if-eqz v1, :cond_8
												 /* .line 83 */
												 try { // :try_start_5
													 v3 = this.mDatabase;
													 /* :try_end_5 */
													 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
													 if ( v3 != null) { // if-eqz v3, :cond_4
														 /* .line 84 */
														 try { // :try_start_6
															 v3 = this.mDatabase;
															 (( android.database.sqlite.SQLiteDatabase ) v3 ).close ( ); // invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V
															 /* :try_end_6 */
															 /* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_1 */
															 /* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
															 /* .line 86 */
														 } // :cond_4
													 } // :goto_2
													 try { // :try_start_7
														 this.mDatabase = v0;
														 /* :try_end_7 */
														 /* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
														 /* .line 53 */
													 } // .end local v0 # "db":Landroid/database/sqlite/SQLiteDatabase;
												 } // .end local v1 # "success":Z
											 } // .end local v2 # "version":I
											 /* :catchall_0 */
											 /* move-exception v3 */
											 /* monitor-exit p0 */
											 /* throw v3 */
											 /* .line 71 */
											 /* .restart local v0 # "db":Landroid/database/sqlite/SQLiteDatabase; */
											 /* .restart local v1 # "success":Z */
											 /* .restart local v2 # "version":I */
										 } // :cond_5
										 try { // :try_start_8
											 /* iget v3, p0, Lcom/openfeint/internal/db/SQLiteOpenHelperX;->mNewVersion:I */
											 (( com.openfeint.internal.db.SQLiteOpenHelperX ) p0 ).onUpgrade ( v0, v2, v3 ); // invoke-virtual {p0, v0, v2, v3}, Lcom/openfeint/internal/db/SQLiteOpenHelperX;->onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
											 /* :try_end_8 */
											 /* .catchall {:try_start_8 ..:try_end_8} :catchall_1 */
											 /* .line 76 */
											 /* :catchall_1 */
											 /* move-exception v3 */
											 try { // :try_start_9
												 (( android.database.sqlite.SQLiteDatabase ) v0 ).endTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
												 /* throw v3 */
												 /* :try_end_9 */
												 /* .catchall {:try_start_9 ..:try_end_9} :catchall_2 */
												 /* .line 82 */
											 } // .end local v2 # "version":I
											 /* :catchall_2 */
											 /* move-exception v3 */
											 if ( v1 != null) { // if-eqz v1, :cond_9
												 /* .line 83 */
												 try { // :try_start_a
													 v4 = this.mDatabase;
													 /* :try_end_a */
													 /* .catchall {:try_start_a ..:try_end_a} :catchall_0 */
													 if ( v4 != null) { // if-eqz v4, :cond_6
														 /* .line 84 */
														 try { // :try_start_b
															 v4 = this.mDatabase;
															 (( android.database.sqlite.SQLiteDatabase ) v4 ).close ( ); // invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V
															 /* :try_end_b */
															 /* .catch Ljava/lang/Exception; {:try_start_b ..:try_end_b} :catch_0 */
															 /* .catchall {:try_start_b ..:try_end_b} :catchall_0 */
															 /* .line 86 */
														 } // :cond_6
													 } // :goto_3
													 try { // :try_start_c
														 this.mDatabase = v0;
														 /* .line 88 */
													 } // :cond_7
												 } // :goto_4
												 /* throw v3 */
												 /* .restart local v2 # "version":I */
											 } // :cond_8
											 if ( v0 != null) { // if-eqz v0, :cond_0
												 (( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
											 } // .end local v2 # "version":I
										 } // :cond_9
										 if ( v0 != null) { // if-eqz v0, :cond_7
											 (( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
											 /* :try_end_c */
											 /* .catchall {:try_start_c ..:try_end_c} :catchall_0 */
											 /* .line 84 */
											 /* :catch_0 */
											 /* move-exception v4 */
											 /* .restart local v2 # "version":I */
											 /* :catch_1 */
											 /* move-exception v3 */
										 } // .end method
										 public abstract void onCreate ( android.database.sqlite.SQLiteDatabase p0 ) {
										 } // .end method
										 public abstract void onUpgrade ( android.database.sqlite.SQLiteDatabase p0, Integer p1, Integer p2 ) {
										 } // .end method
										 public void setSQLiteOpenHelper ( android.database.sqlite.SQLiteOpenHelper p0 ) {
											 /* .locals 0 */
											 /* .param p1, "helper" # Landroid/database/sqlite/SQLiteOpenHelper; */
											 /* .prologue */
											 /* .line 36 */
											 this.mHelper = p1;
											 /* .line 37 */
											 (( com.openfeint.internal.db.SQLiteOpenHelperX ) p0 ).close ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/db/SQLiteOpenHelperX;->close()V
											 /* .line 38 */
											 return;
										 } // .end method
										 public void setSQLiteOpenHelper ( java.lang.String p0, Integer p1 ) {
											 /* .locals 3 */
											 /* .param p1, "path" # Ljava/lang/String; */
											 /* .param p2, "version" # I */
											 /* .prologue */
											 /* .line 29 */
											 int v0 = 1; // const/4 v0, 0x1
											 /* if-ge p2, v0, :cond_0 */
											 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
											 /* new-instance v1, Ljava/lang/StringBuilder; */
											 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
											 final String v2 = "Version must be >= 1, was "; // const-string v2, "Version must be >= 1, was "
											 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
											 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
											 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
											 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
											 /* throw v0 */
											 /* .line 30 */
										 } // :cond_0
										 this.mName = p1;
										 /* .line 31 */
										 /* iput p2, p0, Lcom/openfeint/internal/db/SQLiteOpenHelperX;->mNewVersion:I */
										 /* .line 32 */
										 (( com.openfeint.internal.db.SQLiteOpenHelperX ) p0 ).close ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/db/SQLiteOpenHelperX;->close()V
										 /* .line 33 */
										 return;
									 } // .end method
