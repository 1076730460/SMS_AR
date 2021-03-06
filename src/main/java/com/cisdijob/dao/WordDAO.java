package com.cisdijob.dao;

import java.util.List;
import java.util.Map;

import com.cisdijob.model.entity.Word;

public interface WordDAO {
	public void insertWord(Word word);
	public Word getWord(String newWord);
	public List<Word> getWordList();
	public List<Word> getWordListByMap(Map<String,Object> map);
	public int getWordCount();
	public void deletWord();
}
