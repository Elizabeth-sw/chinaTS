package com.cts.teacher.exam.service;

import com.cts.sys.entity.BaseResponse;
import com.cts.sys.entity.ListResponse;
import com.cts.teacher.domain.vo.PaperVO;
import com.cts.teacher.domain.vo.QuestionVO;
import com.cts.teacher.request.AddQuestionRequest;
import com.cts.teacher.request.QueryPaperRequest;
import com.cts.teacher.request.QueryQuestionRequest;

public interface ITeacherExamService {
	/**
	 * 新增考题
	 * @param request
	 * @return 考题id
	 */
	public BaseResponse<Long> addQuestion(AddQuestionRequest request);
	/**
	 * 查询考题集合
	 * @param request
	 * @return 考题集合
	 */
	public ListResponse<QuestionVO> findQuestionList(QueryQuestionRequest request);
	/**
	 * 根据id查询考题实体
	 * @param id
	 * @return 考题实体
	 */
	public BaseResponse<QuestionVO> findQuestionEntity(Long id);
	/**
	 * 生成试卷
	 * @param teacherId
	 * @return 市局
	 */
	public BaseResponse<Long> buildPaper(Long teacherId);
	/**
	 * 根据id查询试卷实体
	 * @param paperId
	 * @return
	 */
	public BaseResponse<PaperVO> findPaperEntity(Long paperId);
	/**
	 * 查询试卷集合
	 * @param request
	 * @return
	 */
	public ListResponse<PaperVO> findPaperList(QueryPaperRequest request);
}
