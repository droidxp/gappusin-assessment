class com.wiyun.engine.nodes.b {
	 /* .source "_A.java" */
	 /* # static fields */
	 private static java.io.File a;
	 /* # direct methods */
	 com.wiyun.engine.nodes.b ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 709 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static synchronized android.database.sqlite.SQLiteDatabase a ( ) {
		 /* .locals 11 */
		 /* .prologue */
		 int v6 = 0; // const/4 v6, 0x0
		 int v5 = 1; // const/4 v5, 0x1
		 /* .line 729 */
		 /* const-class v7, Lcom/wiyun/engine/nodes/b; */
		 /* monitor-enter v7 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 732 */
		 /* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
		 try { // :try_start_0
			 v8 = com.wiyun.engine.nodes.b.a;
			 /* if-nez v8, :cond_0 */
			 v8 = 			 com.wiyun.engine.nodes._U .b ( );
			 if ( v8 != null) { // if-eqz v8, :cond_0
				 /* .line 733 */
				 /* new-instance v8, Ljava/io/File; */
				 android.os.Environment .getExternalStorageDirectory ( );
				 (( java.io.File ) v9 ).getPath ( ); // invoke-virtual {v9}, Ljava/io/File;->getPath()Ljava/lang/String;
				 final String v10 = ".wiyun/winotice/winotice.db"; // const-string v10, ".wiyun/winotice/winotice.db"
				 /* invoke-direct {v8, v9, v10}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
				 /* .line 737 */
			 } // :cond_0
			 v8 = com.wiyun.engine.nodes.b.a;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* if-nez v8, :cond_2 */
			 /* move-object v0, v6 */
			 /* .line 788 */
			 /* .local v1, "e":Ljava/lang/Exception; */
		 } // :cond_1
	 } // :goto_0
	 /* monitor-exit v7 */
} // .end local v0 # "db":Landroid/database/sqlite/SQLiteDatabase;
} // .end local v1 # "e":Ljava/lang/Exception;
/* .line 741 */
/* .restart local v0 # "db":Landroid/database/sqlite/SQLiteDatabase; */
} // :cond_2
try { // :try_start_1
v8 = com.wiyun.engine.nodes.b.a;
(( java.io.File ) v8 ).getParentFile ( ); // invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;
v8 = (( java.io.File ) v8 ).exists ( ); // invoke-virtual {v8}, Ljava/io/File;->exists()Z
/* if-nez v8, :cond_3 */
/* .line 742 */
v8 = com.wiyun.engine.nodes.b.a;
(( java.io.File ) v8 ).getParentFile ( ); // invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;
v8 = (( java.io.File ) v8 ).mkdirs ( ); // invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z
/* if-nez v8, :cond_3 */
/* move-object v0, v6 */
/* .line 743 */
/* .line 747 */
} // :cond_3
v8 = com.wiyun.engine.nodes.b.a;
v2 = (( java.io.File ) v8 ).exists ( ); // invoke-virtual {v8}, Ljava/io/File;->exists()Z
/* .line 750 */
/* .local v2, "exist":Z */
v8 = com.wiyun.engine.nodes.b.a;
int v9 = 0; // const/4 v9, 0x0
android.database.sqlite.SQLiteDatabase .openOrCreateDatabase ( v8,v9 );
/* .line 751 */
/* if-nez v0, :cond_4 */
/* move-object v0, v6 */
/* .line 752 */
/* .line 753 */
} // :cond_4
int v6 = 1; // const/4 v6, 0x1
(( android.database.sqlite.SQLiteDatabase ) v0 ).setLockingEnabled ( v6 ); // invoke-virtual {v0, v6}, Landroid/database/sqlite/SQLiteDatabase;->setLockingEnabled(Z)V
/* .line 756 */
/* if-nez v2, :cond_6 */
/* .line 757 */
int v5 = 1; // const/4 v5, 0x1
(( android.database.sqlite.SQLiteDatabase ) v0 ).setVersion ( v5 ); // invoke-virtual {v0, v5}, Landroid/database/sqlite/SQLiteDatabase;->setVersion(I)V
/* .line 758 */
com.wiyun.engine.nodes.c$b .a ( v0 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 776 */
} // .end local v2 # "exist":Z
/* :catch_0 */
/* move-exception v1 */
/* .line 779 */
/* .restart local v1 # "e":Ljava/lang/Exception; */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 780 */
try { // :try_start_2
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* .line 784 */
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
/* .line 760 */
} // .end local v1 # "e":Ljava/lang/Exception;
/* .restart local v2 # "exist":Z */
} // :cond_6
try { // :try_start_3
v4 = (( android.database.sqlite.SQLiteDatabase ) v0 ).getVersion ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getVersion()I
/* .line 761 */
/* .local v4, "oldVersion":I */
/* if-le v5, v4, :cond_7 */
/* move v3, v5 */
/* .line 762 */
/* .local v3, "old":Z */
} // :goto_1
/* if-gt v5, v4, :cond_8 */
/* .line 773 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 774 */
int v5 = 1; // const/4 v5, 0x1
(( android.database.sqlite.SQLiteDatabase ) v0 ).setVersion ( v5 ); // invoke-virtual {v0, v5}, Landroid/database/sqlite/SQLiteDatabase;->setVersion(I)V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 729 */
} // .end local v2 # "exist":Z
} // .end local v3 # "old":Z
} // .end local v4 # "oldVersion":I
/* :catchall_0 */
/* move-exception v5 */
/* monitor-exit v7 */
/* throw v5 */
/* .line 761 */
/* .restart local v2 # "exist":Z */
/* .restart local v4 # "oldVersion":I */
} // :cond_7
int v3 = 0; // const/4 v3, 0x0
/* .line 763 */
/* .restart local v3 # "old":Z */
} // :cond_8
/* packed-switch v4, :pswitch_data_0 */
/* .line 769 */
} // :goto_2
/* add-int/lit8 v4, v4, 0x1 */
/* .line 765 */
/* :pswitch_0 */
try { // :try_start_4
com.wiyun.engine.nodes.b .b ( );
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 782 */
} // .end local v2 # "exist":Z
} // .end local v3 # "old":Z
} // .end local v4 # "oldVersion":I
/* .restart local v1 # "e":Ljava/lang/Exception; */
/* :catch_1 */
/* move-exception v5 */
/* .line 784 */
int v0 = 0; // const/4 v0, 0x0
/* .line 783 */
/* :catchall_1 */
/* move-exception v5 */
/* .line 784 */
int v0 = 0; // const/4 v0, 0x0
/* .line 785 */
try { // :try_start_5
/* throw v5 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 763 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
static void a ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p0, "pkg" # Ljava/lang/String; */
/* .prologue */
/* .line 795 */
com.wiyun.engine.nodes.b .a ( );
/* .line 796 */
/* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
/* if-nez v0, :cond_0 */
/* .line 811 */
} // :goto_0
return;
/* .line 800 */
} // :cond_0
try { // :try_start_0
/* new-instance v1, Landroid/content/ContentValues; */
/* invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V */
/* .line 801 */
/* .local v1, "values":Landroid/content/ContentValues; */
final String v2 = "ap"; // const-string v2, "ap"
(( android.content.ContentValues ) v1 ).put ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 802 */
final String v2 = "i"; // const-string v2, "i"
int v3 = 1; // const/4 v3, 0x1
java.lang.Integer .valueOf ( v3 );
(( android.content.ContentValues ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 803 */
final String v2 = "na"; // const-string v2, "na"
int v3 = 0; // const/4 v3, 0x0
(( android.database.sqlite.SQLiteDatabase ) v0 ).insert ( v2, v3, v1 ); // invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 807 */
try { // :try_start_1
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 808 */
/* :catch_0 */
/* move-exception v2 */
/* .line 804 */
} // .end local v1 # "values":Landroid/content/ContentValues;
/* :catch_1 */
/* move-exception v2 */
/* .line 807 */
try { // :try_start_2
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
/* .line 808 */
/* :catch_2 */
/* move-exception v2 */
/* .line 805 */
/* :catchall_0 */
/* move-exception v2 */
/* .line 807 */
try { // :try_start_3
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_3 */
/* .line 810 */
} // :goto_1
/* throw v2 */
/* .line 808 */
/* :catch_3 */
/* move-exception v3 */
} // .end method
private static void b ( ) {
/* .locals 0 */
/* .prologue */
/* .line 792 */
return;
} // .end method
static Boolean b ( java.lang.String p0 ) {
/* .locals 13 */
/* .param p0, "pkg" # Ljava/lang/String; */
/* .prologue */
int v11 = 1; // const/4 v11, 0x1
int v12 = 0; // const/4 v12, 0x0
/* .line 814 */
com.wiyun.engine.nodes.b .a ( );
/* .line 815 */
/* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
/* if-nez v0, :cond_0 */
/* .line 839 */
} // :goto_0
/* .line 819 */
} // :cond_0
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 820 */
/* .local v8, "buf":Ljava/lang/StringBuilder; */
final String v1 = "ap"; // const-string v1, "ap"
(( java.lang.StringBuilder ) v8 ).append ( v1 ); // invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 821 */
final String v2 = "=\'"; // const-string v2, "=\'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 822 */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 823 */
final String v2 = "\'"; // const-string v2, "\'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 825 */
int v9 = 0; // const/4 v9, 0x0
/* .line 827 */
/* .local v9, "c":Landroid/database/Cursor; */
try { // :try_start_0
final String v1 = "na"; // const-string v1, "na"
/* .line 828 */
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
final String v4 = "i"; // const-string v4, "i"
/* aput-object v4, v2, v3 */
/* .line 829 */
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 830 */
int v4 = 0; // const/4 v4, 0x0
/* .line 831 */
int v5 = 0; // const/4 v5, 0x0
/* .line 832 */
int v6 = 0; // const/4 v6, 0x0
/* .line 833 */
int v7 = 0; // const/4 v7, 0x0
/* .line 827 */
/* invoke-virtual/range {v0 ..v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
v1 = /* .line 834 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 835 */
int v1 = 0; // const/4 v1, 0x0
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
v1 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-ne v1, v11, :cond_2 */
/* move v1, v11 */
/* .line 842 */
} // :goto_1
if ( v9 != null) { // if-eqz v9, :cond_1
/* .line 843 */
try { // :try_start_1
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_3 */
/* .line 844 */
int v9 = 0; // const/4 v9, 0x0
/* .line 850 */
} // :cond_1
} // :goto_2
try { // :try_start_2
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_4 */
} // :goto_3
/* move v12, v1 */
/* .line 835 */
} // :cond_2
/* move v1, v12 */
/* .line 842 */
} // :cond_3
if ( v9 != null) { // if-eqz v9, :cond_4
/* .line 843 */
try { // :try_start_3
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_5 */
/* .line 844 */
int v9 = 0; // const/4 v9, 0x0
/* .line 850 */
} // :cond_4
} // :goto_4
try { // :try_start_4
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
/* .line 851 */
/* :catch_0 */
/* move-exception v1 */
/* .line 838 */
/* :catch_1 */
/* move-exception v10 */
/* .line 842 */
/* .local v10, "e":Ljava/lang/Exception; */
if ( v9 != null) { // if-eqz v9, :cond_5
/* .line 843 */
try { // :try_start_5
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_6 */
/* .line 844 */
int v9 = 0; // const/4 v9, 0x0
/* .line 850 */
} // :cond_5
} // :goto_5
try { // :try_start_6
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_2 */
/* .line 851 */
/* :catch_2 */
/* move-exception v1 */
/* .line 840 */
} // .end local v10 # "e":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v1 */
/* .line 842 */
if ( v9 != null) { // if-eqz v9, :cond_6
/* .line 843 */
try { // :try_start_7
/* :try_end_7 */
/* .catch Ljava/lang/Exception; {:try_start_7 ..:try_end_7} :catch_7 */
/* .line 844 */
int v9 = 0; // const/4 v9, 0x0
/* .line 850 */
} // :cond_6
} // :goto_6
try { // :try_start_8
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_8 */
/* .catch Ljava/lang/Exception; {:try_start_8 ..:try_end_8} :catch_8 */
/* .line 853 */
} // :goto_7
/* throw v1 */
/* .line 846 */
/* :catch_3 */
/* move-exception v2 */
/* .line 851 */
/* :catch_4 */
/* move-exception v2 */
/* .line 846 */
/* :catch_5 */
/* move-exception v1 */
/* .restart local v10 # "e":Ljava/lang/Exception; */
/* :catch_6 */
/* move-exception v1 */
} // .end local v10 # "e":Ljava/lang/Exception;
/* :catch_7 */
/* move-exception v2 */
/* .line 851 */
/* :catch_8 */
/* move-exception v2 */
} // .end method
static void c ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p0, "pkg" # Ljava/lang/String; */
/* .prologue */
/* .line 857 */
com.wiyun.engine.nodes.b .a ( );
/* .line 858 */
/* .local v1, "db":Landroid/database/sqlite/SQLiteDatabase; */
/* if-nez v1, :cond_0 */
/* .line 879 */
} // :goto_0
return;
/* .line 862 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 863 */
/* .local v0, "buf":Ljava/lang/StringBuilder; */
final String v3 = "ap"; // const-string v3, "ap"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 864 */
final String v4 = "=\'"; // const-string v4, "=\'"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 865 */
(( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 866 */
final String v4 = "\'"; // const-string v4, "\'"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 869 */
try { // :try_start_0
/* new-instance v2, Landroid/content/ContentValues; */
/* invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V */
/* .line 870 */
/* .local v2, "values":Landroid/content/ContentValues; */
final String v3 = "n"; // const-string v3, "n"
int v4 = 1; // const/4 v4, 0x1
java.lang.Integer .valueOf ( v4 );
(( android.content.ContentValues ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 871 */
final String v3 = "na"; // const-string v3, "na"
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v5 = 0; // const/4 v5, 0x0
(( android.database.sqlite.SQLiteDatabase ) v1 ).update ( v3, v2, v4, v5 ); // invoke-virtual {v1, v3, v2, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 875 */
try { // :try_start_1
(( android.database.sqlite.SQLiteDatabase ) v1 ).close ( ); // invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 876 */
/* :catch_0 */
/* move-exception v3 */
/* .line 872 */
} // .end local v2 # "values":Landroid/content/ContentValues;
/* :catch_1 */
/* move-exception v3 */
/* .line 875 */
try { // :try_start_2
(( android.database.sqlite.SQLiteDatabase ) v1 ).close ( ); // invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
/* .line 876 */
/* :catch_2 */
/* move-exception v3 */
/* .line 873 */
/* :catchall_0 */
/* move-exception v3 */
/* .line 875 */
try { // :try_start_3
(( android.database.sqlite.SQLiteDatabase ) v1 ).close ( ); // invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_3 */
/* .line 878 */
} // :goto_1
/* throw v3 */
/* .line 876 */
/* :catch_3 */
/* move-exception v4 */
} // .end method
static Boolean d ( java.lang.String p0 ) {
/* .locals 13 */
/* .param p0, "pkg" # Ljava/lang/String; */
/* .prologue */
int v11 = 1; // const/4 v11, 0x1
int v12 = 0; // const/4 v12, 0x0
/* .line 882 */
com.wiyun.engine.nodes.b .a ( );
/* .line 883 */
/* .local v0, "db":Landroid/database/sqlite/SQLiteDatabase; */
/* if-nez v0, :cond_0 */
/* .line 907 */
} // :goto_0
/* .line 887 */
} // :cond_0
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 888 */
/* .local v8, "buf":Ljava/lang/StringBuilder; */
final String v1 = "ap"; // const-string v1, "ap"
(( java.lang.StringBuilder ) v8 ).append ( v1 ); // invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 889 */
final String v2 = "=\'"; // const-string v2, "=\'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 890 */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 891 */
final String v2 = "\'"; // const-string v2, "\'"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 893 */
int v9 = 0; // const/4 v9, 0x0
/* .line 895 */
/* .local v9, "c":Landroid/database/Cursor; */
try { // :try_start_0
final String v1 = "na"; // const-string v1, "na"
/* .line 896 */
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
final String v4 = "n"; // const-string v4, "n"
/* aput-object v4, v2, v3 */
/* .line 897 */
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 898 */
int v4 = 0; // const/4 v4, 0x0
/* .line 899 */
int v5 = 0; // const/4 v5, 0x0
/* .line 900 */
int v6 = 0; // const/4 v6, 0x0
/* .line 901 */
int v7 = 0; // const/4 v7, 0x0
/* .line 895 */
/* invoke-virtual/range {v0 ..v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
v1 = /* .line 902 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 903 */
int v1 = 0; // const/4 v1, 0x0
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
v1 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-ne v1, v11, :cond_2 */
/* move v1, v11 */
/* .line 910 */
} // :goto_1
if ( v9 != null) { // if-eqz v9, :cond_1
/* .line 911 */
try { // :try_start_1
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_3 */
/* .line 912 */
int v9 = 0; // const/4 v9, 0x0
/* .line 918 */
} // :cond_1
} // :goto_2
try { // :try_start_2
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_4 */
} // :goto_3
/* move v12, v1 */
/* .line 903 */
} // :cond_2
/* move v1, v12 */
/* .line 910 */
} // :cond_3
if ( v9 != null) { // if-eqz v9, :cond_4
/* .line 911 */
try { // :try_start_3
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_5 */
/* .line 912 */
int v9 = 0; // const/4 v9, 0x0
/* .line 918 */
} // :cond_4
} // :goto_4
try { // :try_start_4
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
/* .line 919 */
/* :catch_0 */
/* move-exception v1 */
/* .line 906 */
/* :catch_1 */
/* move-exception v10 */
/* .line 910 */
/* .local v10, "e":Ljava/lang/Exception; */
if ( v9 != null) { // if-eqz v9, :cond_5
/* .line 911 */
try { // :try_start_5
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_6 */
/* .line 912 */
int v9 = 0; // const/4 v9, 0x0
/* .line 918 */
} // :cond_5
} // :goto_5
try { // :try_start_6
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_2 */
/* .line 919 */
/* :catch_2 */
/* move-exception v1 */
/* .line 908 */
} // .end local v10 # "e":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v1 */
/* .line 910 */
if ( v9 != null) { // if-eqz v9, :cond_6
/* .line 911 */
try { // :try_start_7
/* :try_end_7 */
/* .catch Ljava/lang/Exception; {:try_start_7 ..:try_end_7} :catch_7 */
/* .line 912 */
int v9 = 0; // const/4 v9, 0x0
/* .line 918 */
} // :cond_6
} // :goto_6
try { // :try_start_8
(( android.database.sqlite.SQLiteDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V
/* :try_end_8 */
/* .catch Ljava/lang/Exception; {:try_start_8 ..:try_end_8} :catch_8 */
/* .line 921 */
} // :goto_7
/* throw v1 */
/* .line 914 */
/* :catch_3 */
/* move-exception v2 */
/* .line 919 */
/* :catch_4 */
/* move-exception v2 */
/* .line 914 */
/* :catch_5 */
/* move-exception v1 */
/* .restart local v10 # "e":Ljava/lang/Exception; */
/* :catch_6 */
/* move-exception v1 */
} // .end local v10 # "e":Ljava/lang/Exception;
/* :catch_7 */
/* move-exception v2 */
/* .line 919 */
/* :catch_8 */
/* move-exception v2 */
} // .end method
