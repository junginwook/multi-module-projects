package com.inwook.project.api;

import com.inwook.project.common.Member;
import com.inwook.project.common.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;

	public Long signup (Member member) {
		return memberRepository.save(member).getId();
	}
}
